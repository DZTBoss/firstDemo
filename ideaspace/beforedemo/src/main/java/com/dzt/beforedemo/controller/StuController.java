package com.dzt.beforedemo.controller;

import com.dzt.beforedemo.core.common.CommonUtils;
import com.dzt.beforedemo.core.entity.Page;
import com.dzt.beforedemo.entity.Student;
import com.dzt.beforedemo.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
/*
*
<<<<<<< HEAD

* 这是第一个git项目的第一次修改 (练习冲突的一次修改,我是服务端)
>>>>>>> b55eafcd3735e4d32b29f7a7278131ffdd63f65a
我再一次的进行更改
我 down下来代码后的又一次修改
* */
@Controller
public class StuController {

    @Resource
    private StuService stuService;

    @RequestMapping("/findList")
    public String findList(HttpServletRequest request, Model model){
        Map<String, Object> maps= CommonUtils.getParameterMap(request);

        Page<Student> page = new Page<>();
        if(maps.get("pageNo")!=null){
            page.setPageNo(Integer.valueOf(maps.get("pageNo").toString()));
        }
        if(maps.get("pageSize")!=null){
            page.setPageSize(Integer.valueOf(maps.get("pageSize").toString()));
        }
        page.setParams(maps);
        stuService.findList(page);
        model.addAttribute("page",page);
        return "/list";
    }

}
