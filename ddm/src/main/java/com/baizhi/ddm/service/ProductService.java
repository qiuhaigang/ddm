package com.baizhi.ddm.service;

import java.util.Map;

public interface ProductService {

    Map queryAll(int page ,int rows);


     void deleteMany(int[] ids);
}
