package com.example.httpdemo.controller;

import com.example.httpdemo.dao.BookRepository;
import com.example.httpdemo.data.dto.BookDto;
import com.example.httpdemo.data.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    private BookRepository bookRepository;

    @Autowired //생성자 주입
    public BookController(BookRepository bookRepository){
        this.bookRepository =bookRepository;
    }
    @PostMapping
    public BookEntity postBookEntity (@RequestParam String bookName,@RequestParam int bookPrice){
        return bookRepository.save(new BookEntity(bookName,bookPrice));
    }
    @GetMapping //전체 리스트 조회
    public Iterable<BookEntity> list(){
        return bookRepository.findAll();
    }
    @GetMapping(value = "/{bookId}")
    public Optional<BookEntity> findOne(@PathVariable int bookId){
        return bookRepository.findById(bookId);
    }
    @PutMapping(value = "/{bookId}")
    public BookEntity update(@PathVariable int bookId,@RequestParam String bookName,@RequestParam int bookPrice)
    {
        Optional<BookEntity> bookEntity = bookRepository.findById(bookId);
        bookEntity.get().setBookName(bookName);
        bookEntity.get().setBookPrice(bookPrice);
        return bookRepository.save(bookEntity.get());
    }
    @DeleteMapping
    public void delete(@RequestParam int bookId){
        bookRepository.deleteById(bookId);
    }
}
