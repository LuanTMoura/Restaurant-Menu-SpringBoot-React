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
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:5174")
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
/*
    @GetMapping("/menu/{id}")
    public ResponseEntity<Object> getOneFoods (@PathVariable(value="id") Long id) {
        Optional<FoodModel> foodO = foodRepository.findById(id);
        if(foodO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food not found.");
        }

        foodO.get().add(linkTo(methodOn(FoodController.class).getAllFoods()).withRel("Foods List"));

        return ResponseEntity.status(HttpStatus.OK).body(foodO.get());
    }

    @PutMapping("/menu/{id}")
    public ResponseEntity<Object> updateFood(@PathVariable(value="id") Long id,
                                                @RequestBody @Valid FoodResponseDto foodResponseDto) {

        Optional<FoodModel> foodO = foodRepository.findById(id);
        if(foodO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("food not found.");
        }

        var foodModel = foodO.get();
        BeanUtils.copyProperties (foodResponseDto, foodModel);
        return ResponseEntity.status(HttpStatus.OK).body (foodRepository.save(foodModel));
    }
    */
    @DeleteMapping("/foods/{id}")
    public ResponseEntity<Object> deleteFood (@PathVariable(value="id") Long id) {
        Optional <FoodModel> foodO = foodRepository.findById(id);
        if(foodO.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Food not found.");
        }
        foodRepository.delete(foodO.get());
        return ResponseEntity.status(HttpStatus.OK).body ("Food deleted successfully.");
    }
}

