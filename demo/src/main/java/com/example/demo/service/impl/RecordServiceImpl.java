package com.example.demo.service.impl;

import com.example.demo.mapper.RunoobMapper;
import com.example.demo.model.Runoob;
import com.example.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {

    @SuppressWarnings("all")
    @Autowired
    private RunoobMapper runoobMapper;

    @Override
    public Runoob queryRecordById(Integer id) {
        return runoobMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Runoob> queryAllRecords() {
        return runoobMapper.selectAll();
    }

    @Transactional
    @Override
    public String updateRecordById(Runoob runoob) {
        runoob.setRunoobId(runoob.getRunoobId());
        runoob.setRunoobTitle(runoob.getRunoobTitle());
        runoob.setRunoobAuthor(runoob.getRunoobAuthor());
        int res = runoobMapper.updateByPrimaryKey(runoob);
        return "修改结果： " + res;
    }
}
