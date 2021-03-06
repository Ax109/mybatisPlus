package com.swjd.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swjd.bean.User;
import com.swjd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User login(User user) {
        return userMapper.findUserByUNameAndPwd(user);
    }

    @Override
    public User getOne(QueryWrapper queryWrapper) {
        return null;
    }
}
