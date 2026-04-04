package com.bridgelabz.fundoo_notes.service;



import com.bridgelabz.fundoo_notes.dto.UserDTO;
import com.bridgelabz.fundoo_notes.entity.User;
import com.bridgelabz.fundoo_notes.repository.UserRepository;
import com.bridgelabz.fundoo_notes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public String register(UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());

        repository.save(user);
        return "User Registered Successfully";
    }

    @Override
    public String login(UserDTO dto) {
        User user = repository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!user.getPassword().equals(dto.getPassword())) {
            throw new RuntimeException("Invalid Password");
        }

        return "Login Successful";
    }
}