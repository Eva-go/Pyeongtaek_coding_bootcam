package com.example.httpdemo.dao;

import com.example.httpdemo.data.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookEntity,Integer> {
}
