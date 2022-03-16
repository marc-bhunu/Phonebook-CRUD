package com.mark.phonebook.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="phonebook_db")
public class Phonebook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String homeAddress;
    private String workAddress;
    private String email;

}
