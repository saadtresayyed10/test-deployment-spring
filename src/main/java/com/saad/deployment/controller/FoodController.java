package com.saad.deployment.controller;

import com.saad.deployment.model.Food;
import com.saad.deployment.repo.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    FoodRepo foodRepo;

    @PostMapping("/addFood")
    public Food addFood(@RequestBody Food food) {
        return foodRepo.save(food);
    }

    @GetMapping("/food")
    public List<Food> getFoods() {
        return foodRepo.findAll();
    }

}
