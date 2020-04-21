package com.liuyang.spring_boot.springbootmybatis.controller;

import com.liuyang.spring_boot.springbootmybatis.mapper.PasswordMapper;
import com.liuyang.spring_boot.springbootmybatis.model.Password;
import com.liuyang.spring_boot.springbootmybatis.services.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password")
public class PasswordController {
    @Autowired
    private PasswordService passwordService;

    @RequestMapping(value="/get/{url}", method= RequestMethod.GET)
    public Password getByUrl(@PathVariable("url") String url){
        return passwordService.selectByUrl(url);
    }

}
