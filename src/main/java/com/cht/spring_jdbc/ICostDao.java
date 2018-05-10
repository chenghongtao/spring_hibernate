package com.cht.spring_jdbc;

import java.util.List;


import com.cht.spring_jdbc.entity.Cost;

public interface ICostDao {
   public void del() ;
   public void add();
   public Cost find();
   public List<Cost> findAll();
   public void update();
}
