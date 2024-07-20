package com.uberclone.core.foodservice.mapper;

import com.uberclone.core.foodservice.dto.FoodDTO;
import com.uberclone.core.foodservice.entity.FoodEntity;

public class FoodMapper {
    public static FoodDTO mapToDto(FoodEntity userEntity) {
        FoodDTO userDTO = new FoodDTO();
        userDTO.setFoodName(userEntity.getFoodName());
        userDTO.setPrice(userEntity.getPrice());
        userDTO.setDescription(userEntity.getDescription());
        userDTO.setRate(userEntity.getRate());
        userDTO.setShopName(userEntity.getShopName());
        return userDTO;
    }

    public static FoodEntity mapToEntity(FoodDTO userDto) {
        FoodEntity userEntity = new FoodEntity();
        userEntity.setFoodName(userDto.getFoodName());
        userEntity.setShopName(userDto.getShopName());
        userEntity.setDescription(userDto.getDescription());
        userEntity.setRate(userDto.getRate());
        userEntity.setPrice(userDto.getPrice());
        return userEntity;
    }
}
