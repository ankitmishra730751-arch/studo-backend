package com.ankit.hostelbooking.service;
import java.util.List;
import com.ankit.hostelbooking.entity.User;
import com.ankit.hostelbooking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public User registerUser(User user) {
        return userRepository.save(user);
    }
        public List<User> getAllUsers() {
            return userRepository.findAll();
        }
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }

        return null;
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
    }


