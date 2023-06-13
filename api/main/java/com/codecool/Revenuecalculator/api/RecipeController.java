package com.codecool.Revenuecalculator.api;

import com.codecool.Revenuecalculator.api.model.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1")
public interface RecipeController {

    @GetMapping
    String getAll();

    @PostMapping
    void create(@RequestBody Recipe recipe);

}
