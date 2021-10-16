package com.neitonjc.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neitonjc.email.models.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

}
