package com.example.furniture.service;

import com.example.furniture.data.dao.FuRepository;
import com.example.furniture.data.entity.FurnitureEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuService {
    @Autowired
    private FuRepository fuRepository;

    //READALL
    public List<FurnitureEntity> getAllFurnitures() {
        return fuRepository.findAll();
    }

    // id 조회
    public FurnitureEntity getFuById(int fuId) {
        return fuRepository.findById(fuId).orElse(null);
    }

    // 생성
    public FurnitureEntity createFu(FurnitureEntity furnitureEntity) {
        return fuRepository.save(furnitureEntity);
    }

    // 수정
    public FurnitureEntity updateFu(FurnitureEntity furnitureEntity) {
        return fuRepository.save(furnitureEntity);
    }

    //삭제
    public void deleteFu(int fuId) {
        fuRepository.deleteById(fuId);
    }
}
