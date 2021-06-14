package com.example.demo.service;

import com.example.demo.model.Runoob;

import java.util.List;

public interface RecordService {
    Runoob queryRecordById(Integer id);

    String updateRecordById(Runoob runoob);

    List<Runoob> queryAllRecords();
}
