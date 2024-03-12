package com.example.restaurantmenu.controllers;

import com.example.restaurantmenu.dtos.FoodRequestDto;
import com.example.restaurantmenu.dtos.FoodResponseDto;
import com.example.restaurantmenu.models.FoodModel;
import com.example.restaurantmenu.repositories.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class FoodController {
    @Autowired
    FoodRepository foodRepository;

    @PostMapping("/foods")
    public void saveFood(@RequestBody FoodRequestDto data) {
        FoodModel foodModel = new FoodModel(data);
        foodRepository.save (foodModel);
    }

    @GetMapping("/foods")
    public ResponseEntity<List<FoodResponseDto>> getAll() {
        List<FoodResponseDto> foodsList = foodRepository.findAll().stream().map(FoodResponseDto::new).toList();
        return ResponseEntity.status(HttpStatus.OK).body(foodsList);
    }
}

