package com.emailassistant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.emailassistant.model.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {
}