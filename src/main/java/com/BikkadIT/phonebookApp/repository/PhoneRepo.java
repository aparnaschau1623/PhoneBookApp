package com.BikkadIT.phonebookApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.phonebookApp.model.ContactDetails;

public interface PhoneRepo extends JpaRepository<ContactDetails, Integer> {

}
