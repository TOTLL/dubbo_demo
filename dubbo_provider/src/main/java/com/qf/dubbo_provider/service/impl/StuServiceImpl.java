package com.qf.dubbo_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.qf.service.IStuService;
/**
 * 作者：H
 * 时间：2019/6/28
 */
@Service
public class StuServiceImpl implements IStuService {
    @Override
    public String queryName(Integer id) {
        switch (id){
            case 1:return "牛叔";
            case 2:return "牛叔大大";
            case 3:return "牛大叔";
            case 4:return "大牛叔";
        }
        return null;
    }
}
