package com.example.httpdemo;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class MyUser {
    private int userId;
    private String userName;
    private String userEmail;

}
