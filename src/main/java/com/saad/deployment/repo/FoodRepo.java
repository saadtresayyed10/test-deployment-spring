package com.saad.deployment.repo;

import com.saad.deployment.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodRepo extends JpaRepository<Food, UUID> {
}
