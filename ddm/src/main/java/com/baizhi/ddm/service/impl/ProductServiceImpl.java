package com.baizhi.ddm.service.impl;

import com.baizhi.ddm.dao.ProductDao;
import com.baizhi.ddm.entity.Product;
import com.baizhi.ddm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao productDao;

    public Map queryAll(int page,int rows){

        Map map=new HashMap();

        int start =(page-1) * rows;

        int total=productDao.getCount();

        List<Product> list=productDao.queryAll(start,rows);

        map.put("total",total);
        map.put("rows",list);

        return map;

    }

    public void deleteMany(int[] ids){

        productDao.deleteMany(ids);
    }

}
