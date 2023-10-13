package com.example.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class Hello {
    @RequestMapping(method = RequestMethod.GET, path="/")
    public String world(){
        return "index.html";
    }
}
