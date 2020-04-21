package com.liuyang.spring_boot.springbootmybatis.mapper;

import com.liuyang.spring_boot.springbootmybatis.model.Password;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordMapper {
    Password selectByUrl(String url);
}
