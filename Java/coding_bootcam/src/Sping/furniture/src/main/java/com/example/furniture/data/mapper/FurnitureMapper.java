package com.example.furniture.data.mapper;

import com.example.furniture.data.dto.FurnitureDto;
import com.example.furniture.data.entity.FurnitureEntity;
import org.springframework.stereotype.Component;

@Component
public class FurnitureMapper implements EntityMapper<FurnitureDto, FurnitureEntity> {
    @Override
    public FurnitureEntity toEntity(FurnitureDto furnitureDto) {
        FurnitureEntity furnitureEntity = new FurnitureEntity();
        furnitureEntity.setFuName(furnitureDto.getFuName());
        furnitureEntity.setFuColor(furnitureDto.getFuColor());
        furnitureEntity.setFuPrice(furnitureDto.getFuPrice());
        return furnitureEntity;
    }
}
