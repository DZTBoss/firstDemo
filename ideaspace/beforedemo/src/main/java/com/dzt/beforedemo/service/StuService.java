package com.dzt.beforedemo.service;

import com.dzt.beforedemo.core.entity.Page;
import com.dzt.beforedemo.entity.Student;
import com.dzt.beforedemo.mapper.StuDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StuService {

    @Resource
    private StuDao stuDao;

    public void findList(Page<Student> page){
        List<Student> list = stuDao.findList(page);
        page.setResultList(list);
    }


}
