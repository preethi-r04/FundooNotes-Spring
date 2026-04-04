package com.bridgelabz.fundoo_notes.service;

import com.bridgelabz.fundoo_notes.dto.UserDTO;

public interface UserService {
    String register(UserDTO dto);
    String login(UserDTO dto);
}