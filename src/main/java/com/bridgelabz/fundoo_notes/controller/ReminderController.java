package com.bridgelabz.fundoo_notes.controller;


import com.bridgelabz.fundoo_notes.entity.Reminder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reminder")
public class ReminderController {

    @PostMapping
    public Reminder createReminder(@RequestBody Reminder reminder) {
        return reminder;
    }
}
