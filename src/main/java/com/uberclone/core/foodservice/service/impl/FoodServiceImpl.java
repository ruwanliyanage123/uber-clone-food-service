package com.uberclone.core.foodservice.service.impl;

import com.uberclone.core.foodservice.dao.FoodRepository;
import com.uberclone.core.foodservice.dto.FoodDTO;
import com.uberclone.core.foodservice.entity.FoodEntity;
import com.uberclone.core.foodservice.mapper.FoodMapper;
import com.uberclone.core.foodservice.service.api.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FoodServiceImpl implements FoodService {
    @Autowired
    private FoodRepository foodRepository;

    @Override
    public FoodDTO addFood(FoodDTO userDTO) {
        final FoodEntity requestEntity = FoodMapper.mapToEntity(userDTO);
        final FoodEntity responseEntity = foodRepository.save(requestEntity);
        return FoodMapper.mapToDto(responseEntity);
    }

    @Override
    public List<FoodDTO> getAllFood() {
        final List<FoodEntity> foodEntities = foodRepository.findAll();
        return foodEntities.stream().map(FoodMapper::mapToDto).toList();
    }

    @Override
    public FoodDTO getFoodById(long itemId) {
        final Optional<FoodEntity> foodEntity = foodRepository.findById(itemId);
        return FoodMapper.mapToDto(foodEntity.get());
    }
}
