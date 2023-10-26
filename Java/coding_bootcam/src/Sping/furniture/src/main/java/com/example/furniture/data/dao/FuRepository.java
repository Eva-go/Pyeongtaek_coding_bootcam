package com.example.furniture.data.dao;

import com.example.furniture.data.entity.FurnitureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuRepository extends JpaRepository<FurnitureEntity, Integer> {
}
