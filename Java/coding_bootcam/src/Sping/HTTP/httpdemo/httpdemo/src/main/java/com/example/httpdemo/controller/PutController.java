package com.example.httpdemo.controller;


import com.example.httpdemo.data.dto.BookDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value ="/api/v1/post-api")
public class PutController {

    @PutMapping(value = "/default")
    public String putMethod(){
        return "putController Hi";
    }
    @PutMapping(value = "/member")
    public String postMember(@RequestParam Map<String, Object> putData){
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,Object> entry : putData.entrySet()){
            sb.append(entry.getKey()+ " : "+entry.getValue() + "\n");
        }
        return sb.toString();
    }

   @PutMapping(value = "/member1")
    public String postMemberDto1(@RequestParam BookDto bookDto){
        return bookDto.toString();
   }

}