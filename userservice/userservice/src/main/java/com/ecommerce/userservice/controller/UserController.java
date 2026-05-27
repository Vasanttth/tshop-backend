package com.ecommerce.userservice.controller;

import com.ecommerce.userservice.model.User;
import com.ecommerce.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://localhost:5174",
    "https://tshop-clothing.netlify.app"
})
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.register(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody Map<String, String> request) {
        return userService.login(
                request.get("email"),
                request.get("password")
        );
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateProfile(@PathVariable Long id, @RequestBody User user) {
        return userService.updateProfile(id, user);
    }
}