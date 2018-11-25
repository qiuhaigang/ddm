package com.baizhi.ddm.controller;

import com.baizhi.ddm.dao.ProductDao;
import com.baizhi.ddm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ProductDao productDao;
    @RequestMapping("/query.do")
    public @ResponseBody Map query(int page ,int rows){

        Map map=productService.queryAll(page,rows);

        return map;
    }

    @RequestMapping("/deleteMany.do")
    public @ResponseBody boolean deleteMany(int[] ids){



        try {
            productService.deleteMany( ids);
            return true;
        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }

    }

}
