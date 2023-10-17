package com.example.httpdemo.controller;

import com.example.httpdemo.data.dto.BookDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
@RequestMapping(value ="/api/v1/post-api")
public class PostController {

    @PostMapping(value = "/default")
    public String postMethod(){             //파라메타가 들어오지 않아도 정상적으로 동작예상

        return "Hello~~~";
    }

    //    http://localhost:8080/api/v1/post-api/member
    @PostMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> postData){
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Object> entry : postData.entrySet()) {
            sb.append(entry.getKey() + " : " + entry.getValue() + "\n");
        }
        return sb.toString();
    }
    @PostMapping(value = "/member2")
    public String postMemberDTO(@RequestBody BookDto bookDto ){

        return bookDto.toString();
    }
}