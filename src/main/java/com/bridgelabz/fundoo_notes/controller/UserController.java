package com.bridgelabz.fundoo_notes.controller;

import com.bridgelabz.fundoo_notes.dto.UserDTO;
import com.bridgelabz.fundoo_notes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public String register(@RequestBody UserDTO dto) {
        return service.register(dto);
    }

    @PostMapping("/login")
    public String login(@RequestBody UserDTO dto) {
        return service.login(dto);
    }
}