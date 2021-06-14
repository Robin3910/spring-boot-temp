package com.example.demo.mapper;

import com.example.demo.model.Runoob;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RunoobMapper {
    int deleteByPrimaryKey(Integer runoobId);

    int insert(Runoob record);

    int insertSelective(Runoob record);

    Runoob selectByPrimaryKey(Integer runoobId);

    int updateByPrimaryKeySelective(Runoob record);

    int updateByPrimaryKey(Runoob record);
}