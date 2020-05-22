package com.swjd.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swjd.bean.User;

public interface UserService {
    public abstract User login(User user);

    User getOne(QueryWrapper queryWrapper);
}
