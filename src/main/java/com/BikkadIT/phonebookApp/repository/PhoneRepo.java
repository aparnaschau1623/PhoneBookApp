package com.BikkadIT.phonebookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.phonebookApp.model.Contact;

public interface PhoneRepo extends JpaRepository<Contact, Integer> {

}
