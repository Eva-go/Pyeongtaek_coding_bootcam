package com.example.furniture.service;

import com.example.furniture.data.dto.FurnitureDto;
import com.example.furniture.data.entity.FurnitureEntity;
import com.example.furniture.data.mapper.FurnitureMapper;
import com.example.furniture.data.repository.FurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService {
    private final FurnitureRepository furnitureRepository;
    private final FurnitureMapper furnitureMapper;

    @Autowired
    public FurnitureService(FurnitureRepository furnitureRepository, FurnitureMapper furnitureMapper) {
        this.furnitureRepository = furnitureRepository;
        this.furnitureMapper = furnitureMapper;
    }

    public FurnitureEntity createFurniture(FurnitureDto furnitureDto) {
        FurnitureEntity furnitureEntity = furnitureMapper.toEntity(furnitureDto);  //Mapper : DTO -> Entity
        return furnitureRepository.save(furnitureEntity);
    }

    public List<FurnitureEntity> getAllFurnitures() {

        return furnitureRepository.findAll();
    }

    public  FurnitureEntity getFurnitureById(int fuId) {

        return furnitureRepository.findById(fuId).orElse(null);
    }

    public FurnitureEntity updateFurniture(int fuId, FurnitureDto furnitureDto) {
        FurnitureEntity existFurniture = furnitureRepository.findById(fuId).orElse(null);
        if (existFurniture != null) {
            FurnitureEntity updateFurniture = furnitureMapper.toEntity(furnitureDto);
            updateFurniture.setFuId(fuId);
            return furnitureRepository.save(updateFurniture);
        }
        return null;
    }

    public void deleteFurniture(int fuId) {

        furnitureRepository.deleteById(fuId);
    }


}