package com.example.demo.controller;

import com.example.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;


    @GetMapping(value = "/redis/put")
    public String put(String key, String value){
        redisService.put(key, value);
        return "0";
    }

    @GetMapping(value = "/redis/get")
    public String get(String key) {
        return redisService.get(key);
    }
}
