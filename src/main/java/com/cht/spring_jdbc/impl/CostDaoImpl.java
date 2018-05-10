package com.cht.spring_jdbc.impl;

import java.util.List;
import java.util.concurrent.Delayed;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.cht.spring_jdbc.ICostDao;
import com.cht.spring_jdbc.entity.Cost;

public class CostDaoImpl implements ICostDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void del() {

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public Cost find() {
		String sql="select * from cost where cost_id=?";
		Cost cost=(Cost) hibernateTemplate.find(sql, 2);
		return cost;
	}

	@Override
	public List<Cost> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
