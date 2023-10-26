package com.example.furniture.data.dto;

import com.example.furniture.data.entity.FurnitureEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FurnitureDto {
    private String fuName;
    private String fuColor;
    private int fuPrice;

    public FurnitureEntity toEntity(){
        return FurnitureEntity.builder()
                .fuName(fuName)
                .fuColor(fuColor)
                .fuPrice(fuPrice)
                .build();
    }
}