package com.example.vadim.book.backend.repository;

import com.example.vadim.book.backend.entity.Contact;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
    List<Contact>findAll();
}
