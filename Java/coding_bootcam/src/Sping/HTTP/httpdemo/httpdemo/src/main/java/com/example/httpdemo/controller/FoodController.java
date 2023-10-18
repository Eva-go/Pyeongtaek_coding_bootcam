package com.example.httpdemo.controller;


import com.example.httpdemo.dao.FoodRepository;
import com.example.httpdemo.data.dto.FoodDto;
import com.example.httpdemo.data.entity.FoodEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/food")
public class FoodController {
    private FoodRepository foodRepository;

    @Autowired //생성자 주입
    public FoodController(FoodRepository foodRepository){
        this.foodRepository =foodRepository;
    }
    @PostMapping
    public FoodEntity postFoodEntity (@RequestParam String foodName, @RequestParam int foodPrice){
        return foodRepository.save(new FoodEntity(foodName,foodPrice));
    }
    @GetMapping //전체 리스트 조회
    public Iterable<FoodEntity> list(){
        return foodRepository.findAll();
    }
    @GetMapping(value = "/{foodId}")
    public Optional<FoodEntity> findOne(@PathVariable int foodId){
        return foodRepository.findById(foodId);
    }
    @PutMapping(value = "/{foodId}")
    public FoodEntity update(@PathVariable int foodId,@RequestParam String foodName,@RequestParam int foodPrice)
    {
        Optional<FoodEntity> foodEntity = foodRepository.findById(foodId);
        foodEntity.get().setFoodName(foodName);
        foodEntity.get().setFoodPrice(foodPrice);
        return foodRepository.save(foodEntity.get());
    }
    @DeleteMapping
    public void delete(@RequestParam int foodId){
        foodRepository.deleteById(foodId);
    }
}
