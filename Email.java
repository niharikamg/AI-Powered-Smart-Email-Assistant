package com.emailassistant.model;

import jakarta.persistence.*;

@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sender;
    private String subject;
    private String content;
    private String category;

    // Getters and Setters
}