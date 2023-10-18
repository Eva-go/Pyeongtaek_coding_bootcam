package com.example.httpdemo.data.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BookEntity {
    @Id //ID를 Primary key로 사용하겠다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto-increment strategy(자동으로 1식 증가)
    private int bookId; //Primary key
    @Column
    private String bookName;
    private int bookPrice;

    public BookEntity(String bookName,int bookPrice){
        this.bookName = bookName;
        this.bookPrice= bookPrice;
    }
}
