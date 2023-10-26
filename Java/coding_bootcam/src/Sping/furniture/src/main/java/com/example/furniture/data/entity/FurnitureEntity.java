package com.example.furniture.data.entity;

import com.example.furniture.data.dto.FurnitureDto;
import lombok.*;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
//@Table(name="furniture")
public class FurnitureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //+1 auto
    private int fuId;       //PK +1 auto
    private String fuName;
    private String fuColor;
    private int fuPrice;

    public FurnitureDto toDto(){
        return FurnitureDto.builder()
                //.fuName("빨강") 도 가능 데이터 교환을 위해서 입력값을 넣음
                .fuName(fuName)
                .fuColor(fuColor)
                .fuPrice(fuPrice)
                .build();
    }

}