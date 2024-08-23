package org.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.hibernate.annotations.Generated;

import java.time.LocalDate;

@Entity
public class User {

    @Id
    @Generated
    Long id;

    String username;
    String email;

   // @OneToMany
    //Recipe recipe;
    String password;
    String roles;
    LocalDate dateRegistered;








}
