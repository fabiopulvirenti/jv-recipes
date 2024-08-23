package org.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Recipe {
    @Id
    @Generated
     Long id;



     String title;
     String description;
     String instruction;
     int preparationTime;
     int cookingTime;
     int servings;
     int difficultyLevel;
     int rating;
     String listOfIngredients;  // to review later
     String listOfCategories;

     @ManyToOne
     User used;
     LocalDate dateCreated;
     LocalDate lastModified;

    public Recipe() {
        this.title = title;
        this.description = description;
        this.instruction = instruction;
        this.preparationTime = preparationTime;
        this.cookingTime = cookingTime;
        this.servings = servings;
        this.difficultyLevel = difficultyLevel;
        this.rating = rating;
        this.listOfIngredients = listOfIngredients;
        this.listOfCategories = listOfCategories;
        this.dateCreated = dateCreated;
        this.lastModified = lastModified;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
