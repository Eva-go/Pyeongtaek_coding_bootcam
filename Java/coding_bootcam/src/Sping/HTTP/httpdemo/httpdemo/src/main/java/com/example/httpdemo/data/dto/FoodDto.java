package com.example.httpdemo.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class FoodDto {
    private int foodId;
    private String foodName;
    private int foodPrice;
}
