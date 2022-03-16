package com.mark.phonebook.service;

import com.mark.phonebook.model.Phonebook;

import java.util.List;
import java.util.Optional;

public interface IPhonebookService {

    List<Phonebook> list();

    Optional<Phonebook> getContact(Long id);

    void delete(Long id);

    Phonebook createContact(Phonebook contact);

    Phonebook updateContact(Phonebook contact);
}
