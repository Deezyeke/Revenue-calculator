package com.codecool.Revenuecalculator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Recipe {

    @Id
    private Long id;

    private String name;

}
