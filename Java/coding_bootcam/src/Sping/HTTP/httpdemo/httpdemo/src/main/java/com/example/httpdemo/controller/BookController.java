package com.example.httpdemo.controller;

import com.example.httpdemo.data.dto.BookDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private List<BookDto> bookList = new ArrayList<>();
    @PostMapping(value = "/post")
    public String postBookDto(@RequestParam BookDto bookDto)
    {
        bookList.add(bookDto);

        return "등록 되었습니다 Total books 갯수: "+bookList.size();
    }
    @GetMapping(value = "/get")
    public BookDto getBookById(@PathVariable int id){
        if(id>=0 && id<bookList.size())
        {
            return bookList.get(id);
        }
        else
        {
            return null;
        }
    }

    @PutMapping("/update/{id}")
    public String updateBookById(@PathVariable int id, @RequestBody BookDto updateBookDto){
        if(id>= 0 && id<bookList.size()){
            bookList.set(id,updateBookDto);
            return "아이디: "+id+"의 데이터가 수정되었습니다.";
        }
        else {
            return "Book ID :" +id + "의 데이터가 존재하지 않습니다.";
        }
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBookById(@PathVariable int id){
        if(id>=0 && id < bookList.size()){
            bookList.remove(id);
            return "요청하신 ID : "+id+"의 데이터를 삭제하였습니다.";
        }
        else {
            return "요청하신  ID : [ " +id+ "]의 데이터가 존재하지 않습니다.";
        }
    }



}
