package com.example.httpdemo.data.dto;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Getter
@Setter
public class BookDto {
    private int bookId;
    private String bookName;
    private int bookPrice;
//-------------------------------------

}
