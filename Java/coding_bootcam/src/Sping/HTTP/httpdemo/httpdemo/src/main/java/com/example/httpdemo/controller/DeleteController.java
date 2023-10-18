package com.example.httpdemo.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value ="/api/v1/post-api")
public class DeleteController {

    @DeleteMapping(value = "/delete/{variable}")
    public String DeleteVariable(@PathVariable String variable){ //실제 db연동후
        return "요청하신 "+ variable+"삭제 하였습니다.";
    }
}
