package com.bridgelabz.fundoo_notes.service;


import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(String message) {
        new Thread(() -> {
            System.out.println("Sending Notification: " + message);
        }).start();
    }
}