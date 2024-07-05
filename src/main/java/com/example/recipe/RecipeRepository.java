// Write your code here

package com.example.recipe;

import com.example.recipe.Recipe;
import java.util.*;

public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();

    Recipe getRecipeById(int recipeId);

    Recipe addRecipe(Recipe recipe);
}