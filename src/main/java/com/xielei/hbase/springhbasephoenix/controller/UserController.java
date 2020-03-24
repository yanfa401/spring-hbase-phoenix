package com.xielei.hbase.springhbasephoenix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xielei.hbase.springhbasephoenix.mapper.UserMapper;
import com.xielei.hbase.springhbasephoenix.pojo.User;

/**
 * <br>
 *
 * @author xie.lei2<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2020年03月24日 <br>
 * @since R9.0<br>
 */

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserMapper userMapper;
    
    @GetMapping("/getAll")
    public List<User> getAll() {
        return userMapper.selectAll();
    }
}
