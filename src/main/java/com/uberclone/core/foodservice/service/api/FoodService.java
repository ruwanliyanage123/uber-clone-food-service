package com.uberclone.core.foodservice.service.api;

import com.uberclone.core.foodservice.dto.FoodDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FoodService {

    /**
     * To create FoodDTO
     *
     * @param foodDTO user dto
     */
    public abstract FoodDTO addFood(FoodDTO foodDTO);

    /**
     * To get all food
     *
     * @return all food
     */
    public abstract List<FoodDTO> getAllFood();

    /**
     * To get food by Id
     *
     * @param itemId get food by id
     * @return food by id
     */
    public abstract FoodDTO getFoodById(long itemId);
}
