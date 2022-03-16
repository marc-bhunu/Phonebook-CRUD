package com.mark.phonebook.controller;
import com.mark.phonebook.model.Phonebook;
import com.mark.phonebook.service.IPhonebookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@Tag(name = "Phonebook Endpoints", description = "Endpoints for a CRUD phonebook application")
@RestController
@RequestMapping("/api/v1/phonebook")
public class PhonebookController {
    IPhonebookService phonebookService;

    public PhonebookController(IPhonebookService phonebookService){
        this.phonebookService = phonebookService;
    }
    @Operation(summary = "Get Contacts",description = "Retrieving all contacts from phonebook")
    @GetMapping("/all")
    public List<Phonebook> list(){
        return phonebookService.list();

    }
    @Operation(summary = "Get a contact",description = "Retrieving a contact from phonebook using an id")
    @GetMapping("/contact/{id}")
    public Optional<Phonebook> getContact(@PathVariable Long id){
        return phonebookService.getContact(id);
    }

    @Operation(summary = "Create a contact",description = "Adding a contact to phonebook")
    @PostMapping("/add")
    public Phonebook createContact(@RequestBody final Phonebook contact){
        return phonebookService.createContact(contact);
    }

    @Operation(summary = "Delete a contact",description = "Delete a contact using an id")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        phonebookService.delete(id);
    }

    @Operation(summary = "Update a contact",description = "Update a single contact using an id")
    @PatchMapping("/update/{id}")
    public Phonebook upContact(@RequestBody final Phonebook contact){
        return phonebookService.updateContact(contact);
    }

}
