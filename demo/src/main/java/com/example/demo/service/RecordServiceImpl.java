package com.example.demo.service;

import com.example.demo.mapper.RunoobMapper;
import com.example.demo.model.Runoob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl implements RecordService{

    @Autowired
    private RunoobMapper runoobMapper;

    @Override
    public Runoob queryRecordById(Integer id) {
        return runoobMapper.selectByPrimaryKey(id);
    }
}
