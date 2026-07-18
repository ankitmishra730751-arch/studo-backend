package com.ankit.hostelbooking.service;
import java.util.List;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.ankit.hostelbooking.entity.User;
import com.ankit.hostelbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ankit.hostelbooking.security.JwtUtil;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtUtil jwtUtil;
    public User registerUser(User user) {

        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("Email already registered");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }
    public String login(String email, String password, String role) {

        User user = userRepository.findByEmail(email);

        System.out.println("User = " + user);

        if (user != null) {
            System.out.println("DB Password = " + user.getPassword());
            System.out.println("Password Match = " +
                    passwordEncoder.matches(password, user.getPassword()));
        }

        if (user != null
                && passwordEncoder.matches(password, user.getPassword())
                && user.getRole().equalsIgnoreCase(role)) {

            return jwtUtil.generateToken(email);
        }

        return "Login Failed";
    }
    public User updateUser(Integer id, User updatedUser) {

        User user = userRepository.findById(id).orElse(null);

        if (user != null) {
            user.setName(updatedUser.getName());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            user.setPhone(updatedUser.getPhone());
            user.setRole(updatedUser.getRole());

            return userRepository.save(user);
        }

        return null;
    }
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
    public User getUserProfile(String email) {
        return userRepository.findByEmail(email);
    }
    }


