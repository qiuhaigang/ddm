package com.baizhi.ddm.dao;

import com.baizhi.ddm.entity.User;

import java.util.List;

public interface UserDao {


    public List<User> selectAll();

    public User select(User user);
}
