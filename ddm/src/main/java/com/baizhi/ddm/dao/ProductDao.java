package com.baizhi.ddm.dao;

import com.baizhi.ddm.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {

  List<Product> queryAll(@Param("start") int start ,@Param("rows") int rows);

  int getCount();

  void deleteMany(int[] ids);

}
