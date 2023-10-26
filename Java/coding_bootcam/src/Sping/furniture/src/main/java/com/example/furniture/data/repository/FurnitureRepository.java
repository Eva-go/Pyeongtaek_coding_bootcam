package com.example.furniture.data.repository;

import com.example.furniture.data.entity.FurnitureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureRepository extends JpaRepository<FurnitureEntity,Integer> {
}
