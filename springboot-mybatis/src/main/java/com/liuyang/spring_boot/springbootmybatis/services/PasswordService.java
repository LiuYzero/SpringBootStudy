package com.liuyang.spring_boot.springbootmybatis.services;

import com.liuyang.spring_boot.springbootmybatis.mapper.PasswordMapper;
import com.liuyang.spring_boot.springbootmybatis.model.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Password 服务类
 * 用于处理各种事务
 */
@Service
public class PasswordService {

    @Autowired
    private PasswordMapper passwordMapper;


    public Password selectByUrl(String url) {
        return passwordMapper.selectByUrl(url);
    }
}
