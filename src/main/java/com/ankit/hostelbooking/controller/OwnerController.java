package com.ankit.hostelbooking.controller;

import com.ankit.hostelbooking.entity.Owner;
import com.ankit.hostelbooking.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import com.ankit.hostelbooking.entity.Hostel;

@RestController
@CrossOrigin(origins = {
        "http://localhost:5173",
        "https://studo-frontend.vercel.app",
        "https://stubo.in",
        "https://www.stubo.in"
})
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/register")
    public Owner register(@RequestBody Owner owner) {
        return ownerService.registerOwner(owner);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {

        return ownerService.login(email, password);
    }

    @GetMapping("/profile")
    public Owner getProfile() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String email = authentication.getName();

        return ownerService.getOwnerProfile(email);
    }
    @GetMapping("/my-hostel")
    public Hostel getMyHostel() {

        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        String email = authentication.getName();

        return ownerService.getMyHostel(email);
    }
}