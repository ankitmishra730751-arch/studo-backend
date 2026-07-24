package com.ankit.hostelbooking.service;

import com.ankit.hostelbooking.entity.Owner;
import com.ankit.hostelbooking.repository.HostelRepository;
import com.ankit.hostelbooking.repository.OwnerRepository;
import com.ankit.hostelbooking.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.ankit.hostelbooking.entity.Hostel;
import com.ankit.hostelbooking.repository.HostelRepository;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private HostelRepository hostelRepository;

    public Owner registerOwner(Owner owner) {

        if (ownerRepository.findByEmail(owner.getEmail()) != null) {
            throw new RuntimeException("Email already registered");
        }

        if (ownerRepository.findByPhone(owner.getPhone()) != null) {
            throw new RuntimeException("Phone number already registered");
        }

        owner.setPassword(passwordEncoder.encode(owner.getPassword()));
        owner.setRole("OWNER");

        return ownerRepository.save(owner);
    }


    public String login(String email, String password) {

        Owner owner = ownerRepository.findByEmail(email);

        if (owner != null &&
                passwordEncoder.matches(password, owner.getPassword())) {

            return jwtUtil.generateToken(email);
        }

        return "Login Failed";
    }

    // Profile
    public Owner getOwnerProfile(String email) {
        return ownerRepository.findByEmail(email);
    }
    public Hostel getMyHostel(String email) {

        Owner owner = ownerRepository.findByEmail(email);

        if (owner == null) {
            return null;
        }

        return hostelRepository.findByOwnerPhone(owner.getPhone());
    }
}
