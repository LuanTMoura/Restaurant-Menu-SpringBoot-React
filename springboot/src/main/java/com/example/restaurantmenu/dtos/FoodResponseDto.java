package com.example.restaurantmenu.dtos;

import com.example.restaurantmenu.models.FoodModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FoodResponseDto(@NotNull Long idFood, @NotBlank String title, @NotBlank String image, @NotNull Integer price){
    public FoodResponseDto(FoodModel foodModel){
        this(foodModel.getIdFood(), foodModel.getTitle(), foodModel.getImage(), foodModel.getPrice());
    }
}
