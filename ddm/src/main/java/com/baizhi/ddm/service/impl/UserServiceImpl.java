package com.baizhi.ddm.service.impl;


import com.baizhi.ddm.dao.UserDao;
import com.baizhi.ddm.entity.User;
import com.baizhi.ddm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> selectAll(){


        List<User> list=userDao.selectAll();


        return  list;




    }


    public boolean select(User user){

        User user2=userDao.select(user);

        if(user2!=null){

            return true;

        }
        return false;


    }
}
