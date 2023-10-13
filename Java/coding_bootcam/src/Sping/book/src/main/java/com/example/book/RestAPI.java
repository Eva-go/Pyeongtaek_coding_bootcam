package com.example.book;

import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class RestAPI {
    private List<Book> bookList = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET, path = "/books")
    public List<Book> GetAll() {
        return bookList;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public String Add(@RequestBody Book book){
        bookList.add(book);
        return "Add 메소드입니다";
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/update/{id}")
    public String Update(@RequestBody Book book, @PathVariable Long id){
        for (int i = 0; i < bookList.size(); i++) {
            Book find_book = bookList.get(i);
            if(find_book.getId() == id){
                find_book.setAuthor(book.getAuthor());
                find_book.setName(book.getName());
                find_book.setPrice(book.getPrice());
                return "수정되었습니다";
            }
        }
        return "해당 ID를 찾을 수 없습니다.";
    }

    @DeleteMapping("/delete/{id}")
    public String Delete(@PathVariable int id){
        for (int i = 0; i < bookList.size(); i++){
            Book find_book = bookList.get(i);
            if (find_book.getId() == id){
                bookList.remove(i);
                return "삭제되었습니다";
            }
        }
        return "Delete 메소드입니다.";
    }


}
