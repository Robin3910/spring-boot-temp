package com.example.demo.service;

public interface RedisService {

    public void put(String key, String value);

    public String get(String key);
}
