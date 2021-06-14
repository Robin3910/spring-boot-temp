package com.example.demo.controller;

import com.example.demo.model.Runoob;
import com.example.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private RecordService recordService;

    @GetMapping(value = "/records")
    public List<Runoob> getRecords(){
        return recordService.queryAllRecords();
    }

    @GetMapping(value = "/record/{id}")
    public Runoob getRecordById(@PathVariable("id") Integer id){
        return recordService.queryRecordById(id);
    }


    @PostMapping(value = "/update")
    public String updateById(Runoob runoob) {
        return recordService.updateRecordById(runoob);
    }
}
