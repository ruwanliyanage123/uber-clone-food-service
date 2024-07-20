package com.uberclone.core.foodservice.controller;

import com.uberclone.core.foodservice.dto.FoodDTO;
import com.uberclone.core.foodservice.service.api.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/food-service")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @PostMapping()
    public ResponseEntity<FoodDTO> addFood(@RequestBody FoodDTO userDTO) {
        final FoodDTO foodDTO = foodService.addFood(userDTO);
        return new ResponseEntity<>(foodDTO, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<FoodDTO>> getAllFood() {
        final List<FoodDTO> foodDTOS = foodService.getAllFood();
        return new ResponseEntity<>(foodDTOS, HttpStatus.OK);
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<FoodDTO> getFoodById(@PathVariable("itemId") String itemId) {
        final FoodDTO foodDTO = foodService.getFoodById(Long.parseLong(itemId));
        return new ResponseEntity<>(foodDTO, HttpStatus.OK);
    }
}
