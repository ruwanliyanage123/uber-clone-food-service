package com.uberclone.core.foodservice.dao;

import com.uberclone.core.foodservice.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FoodRepository extends JpaRepository<FoodEntity, Long> {
}
