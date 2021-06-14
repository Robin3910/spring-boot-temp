package com.example.demo.controller;

import com.example.demo.model.Runoob;
import com.example.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private RecordService recordService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "hello spring";
    }


    @RequestMapping(value = "/record")
    @ResponseBody
    public Runoob getRecordById(Integer id){
        return recordService.queryRecordById(id);
    }
}
