package com.mark.phonebook.repository;

import com.mark.phonebook.model.Phonebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhonebookRepository extends JpaRepository<Phonebook, Long> {
}
