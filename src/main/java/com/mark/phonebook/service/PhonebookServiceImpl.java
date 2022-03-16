package com.mark.phonebook.service;

import com.mark.phonebook.model.Phonebook;
import com.mark.phonebook.repository.PhonebookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PhonebookServiceImpl implements IPhonebookService {

    PhonebookRepository phonebookRepository;

    public PhonebookServiceImpl(PhonebookRepository phonebookRepository){
        this.phonebookRepository = phonebookRepository;

    }

    @Override
    public List<Phonebook> list() {
        return phonebookRepository.findAll();

    }

    @Override
    public Optional<Phonebook> getContact(Long id) {
        return phonebookRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        phonebookRepository.deleteById(id);

    }

    @Override
    public Phonebook createContact(Phonebook contact) {
        return phonebookRepository.save(contact);
    }

    @Override
    public Phonebook updateContact(Phonebook contact) {
        return phonebookRepository.save(contact);
    }
}
