package com.example.httpdemo.data.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class FoodEntity {
    @Id //ID를 Primary key로 사용하겠다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto-increment strategy(자동으로 1식 증가)
    private int foodId; //Primary key
    @Column
    private String foodName;
    private int foodPrice;

    public FoodEntity(String foodName,int foodPrice){
        this.foodName = foodName;
        this.foodPrice= foodPrice;
    }
}
