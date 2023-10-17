package com.example.httpdemo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value ="/api/v1/get-api")
public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello~~~~";
    }

    @GetMapping(value = "/example")
    public String getExample(@RequestParam(name = "param", defaultValue = "냉무") String param) {
        // "param" 파라미터가 없을 경우 "Default" 값을 사용
        return "Received param " + param;
    }
}
