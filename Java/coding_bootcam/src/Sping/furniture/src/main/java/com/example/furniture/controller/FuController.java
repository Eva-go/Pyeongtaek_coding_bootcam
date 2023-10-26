package com.example.furniture.controller;

import com.example.furniture.data.dto.FurnitureDto;
import com.example.furniture.data.entity.FurnitureEntity;
import com.example.furniture.service.FuService;
import com.example.furniture.service.FurnitureService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/furniture")
public class FuController {
    private final FurnitureService furnitureService;

    //    @Autowired
    //    private FurnitureService furnitureService;

    //    @Autowired //생성자 방식
    //    public FurnitureController(FurnitureService furnitureService){
    //        this.furnitureService = furnitureService;
    //    }

    @GetMapping
    public List<FurnitureEntity> getFurnitures(){
        return furnitureService.getAllFurnitures();
    }

    @GetMapping("/{fuId}")
    public FurnitureEntity getFurniture(@PathVariable int fuId){
        return furnitureService.getFurnitureById(fuId);
    }

    //새로운 가구 생성
    @PostMapping
    public FurnitureEntity createFurniture(@RequestBody FurnitureDto furnitureDto) {
        //dto를 entity로 변환
        FurnitureEntity createFurniture = furnitureService.createFurniture(furnitureDto);
        //Service를 통해 Entity 저장
        return furnitureService.createFurniture(furnitureDto);
    }

    @PutMapping("/{fuId}")
    public FurnitureEntity updateFurniture(@PathVariable int fuId, @RequestBody FurnitureDto furnitureDto){
        return furnitureService.updateFurniture(fuId, furnitureDto);
    }

    @DeleteMapping("/{fuId}")
    public void deleteFurniture(@PathVariable int fuId){
        furnitureService.deleteFurniture(fuId);
    }
}