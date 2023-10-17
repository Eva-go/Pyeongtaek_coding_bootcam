package com.example.httpdemo.controller;

import com.example.httpdemo.data.dto.BookDto;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.lang.reflect.Member;
import java.util.Map;
import java.util.Objects;


@RestController
@RequestMapping(value ="/api/v1/get-api")
public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() { return "Hello~~~~"; }

    @GetMapping(value = "/example")
    public String getExample(@RequestParam(name = "param", defaultValue = "냉무") String param) {
        // "param" 파라미터가 없을 경우 "Default" 값을 사용
        return "Received param: " + param;}

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return "name= "+variable;}
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String id,
            @RequestParam String name,
            @RequestParam String email) {
        return id + " " + name + " " + email;
    }
    @GetMapping(value = "/request11")
    public String getRequestParam11(
            @RequestParam String name,
            @RequestParam int price,
            @RequestParam int qty) {
        return name + " 가격: "+price+" 수량: "+qty+" = "+" Total : "  +(price*qty) ;
    }
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> entry : param.entrySet()) {
            sb.append(entry.getKey() + " : " + entry.getValue() + "\n");
        }

        return sb.toString();
    }
    @GetMapping(value = "/request3")
    public String getRequestParam3(@RequestParam int bookId, @RequestParam String bookName,@RequestParam int bookPrice){
        BookDto bookDto = new BookDto();
        bookDto.setBookId(bookId);
        bookDto.setBookName(bookName);
        bookDto.setBookPrice(bookPrice);
        return bookDto.toString();
    }
    @GetMapping(value = "/request4")
    public BookDto getRequestParam4(@RequestParam int bookId, @RequestParam String bookName,@RequestParam int bookPrice){
        BookDto bookDto = new BookDto();
        bookDto.setBookId(bookId);
        bookDto.setBookName(bookName);
        bookDto.setBookPrice(bookPrice);
        return bookDto;
    }
}
