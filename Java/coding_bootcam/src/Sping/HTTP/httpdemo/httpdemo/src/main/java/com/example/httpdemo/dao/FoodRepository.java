package com.example.httpdemo.dao;

import com.example.httpdemo.data.entity.FoodEntity;
import org.springframework.data.repository.CrudRepository;

public interface FoodRepository extends CrudRepository<FoodEntity,Integer> {
}
