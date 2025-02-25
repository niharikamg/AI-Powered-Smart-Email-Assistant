package com.emailassistant.controller;

import org.springframework.web.bind.annotation.*;
import com.emailassistant.service.EmailService;
import com.emailassistant.model.Email;
import java.util.List;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public Email addEmail(@RequestBody Email email) {
        return emailService.addEmail(email);
    }

    @GetMapping
    public List<Email> getAllEmails() {
        return emailService.getAllEmails();
    }

    @GetMapping("/summarize/{id}")
    public String summarizeEmail(@PathVariable Long id) {
        return emailService.summarizeEmail(id);
    }

    @GetMapping("/auto-reply/{id}")
    public String generateAutoReply(@PathVariable Long id) {
        return emailService.generateAutoReply(id);
    }
}