package com.baizhi.ddm.service;

import com.baizhi.ddm.entity.User;

import java.util.List;

public interface UserService {


    public List<User> selectAll();

    public boolean select(User user);
}
