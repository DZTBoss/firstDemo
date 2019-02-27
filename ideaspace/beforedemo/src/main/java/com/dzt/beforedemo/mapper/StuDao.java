package com.dzt.beforedemo.mapper;

import com.dzt.beforedemo.core.entity.Page;
import com.dzt.beforedemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuDao {

    public List<Student> findList(Page<Student> page);

}
