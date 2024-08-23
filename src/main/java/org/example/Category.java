package org.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Generated;

@Entity
public class Category {

    @Id
    @Generated
    Long id;

    String name;
}
