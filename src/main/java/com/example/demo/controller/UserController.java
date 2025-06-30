package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/batch")
    public List<User> saveUsers(@RequestBody List<User> users) {
        return userRepository.saveAll(users);
    }

    @GetMapping
    public Page<User> getUsers(@RequestParam int page, @RequestParam int size) {
        return userRepository.findAll(PageRequest.of(page, size));
    }
}