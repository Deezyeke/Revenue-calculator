package com.codecool.Revenuecalculator.api;

import com.codecool.Revenuecalculator.api.model.Recipe;
import com.codecool.Revenuecalculator.service.RecipeService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RecipeControllerImpl implements RecipeController {

    private final RecipeService recipeService;
    @Override
    public String getAll() {
        return null;
    }

    @Override
    public void create(Recipe recipe) {
        com.codecool.Revenuecalculator.entity.Recipe recipe1 = new com.codecool.Revenuecalculator.entity.Recipe();
        recipe1.setName(recipe.getName());
        recipeService.create(recipe1);
    }

}
