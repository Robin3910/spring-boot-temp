package com.example.demo.mapper;

import com.example.demo.model.Runoob;

import java.util.List;

public interface RunoobMapper {
    int deleteByPrimaryKey(Integer runoobId);

    int insert(Runoob record);

    int insertSelective(Runoob record);

    Runoob selectByPrimaryKey(Integer runoobId);

    List<Runoob> selectAll();

    int updateByPrimaryKeySelective(Runoob record);

    int updateByPrimaryKey(Runoob record);
}