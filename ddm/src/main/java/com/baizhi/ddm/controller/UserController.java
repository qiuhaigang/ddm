package com.baizhi.ddm.controller;


import com.baizhi.ddm.entity.User;
import com.baizhi.ddm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("selectAll")
    public String selecAll(HttpServletRequest request){


        List<User> list=userService.selectAll();

       request.setAttribute("list",list);

       return "first";

    }

    @RequestMapping("/login.do")
    public String select(User user,HttpServletRequest request){



        boolean result = userService.select(user);

        request.setAttribute("result",result);

        return "first";
    }

}
