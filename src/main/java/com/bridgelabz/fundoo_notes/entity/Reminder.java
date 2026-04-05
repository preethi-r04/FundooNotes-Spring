package com.bridgelabz.fundoo_notes.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private String email;
    private String time;
}