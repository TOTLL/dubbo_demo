package com.qf.dubbo_comsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.service.IStuService;
import com.qf.service.IStuService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建人：H
 * 时间：2019/6/28
 */
@RestController
public class StuController {

    @Reference
    private IStuService stuService;

    @RequestMapping("/stu/{id}")
    public String queryName(@PathVariable Integer id){
        String s = stuService.queryName(id);
        return s;
    }
}
