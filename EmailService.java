package com.emailassistant.service;

import org.springframework.stereotype.Service;
import com.emailassistant.model.Email;
import com.emailassistant.repository.EmailRepository;
import java.util.List;

@Service
public class EmailService {

    private final EmailRepository emailRepository;

    public EmailService(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }

    public Email addEmail(Email email) {
        return emailRepository.save(email);
    }

    public List<Email> getAllEmails() {
        return emailRepository.findAll();
    }

    public String summarizeEmail(Long id) {
        return "This is a summarized version of the email with ID: " + id;
    }

    public String generateAutoReply(Long id) {
        return "Suggested AI-generated reply for email ID: " + id;
    }
}