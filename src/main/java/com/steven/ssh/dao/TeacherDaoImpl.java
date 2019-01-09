package com.steven.ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class TeacherDaoImpl implements TeacherDao{

	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Override
	public int insert() {
		System.out.println("TeacherDaoImpl.insert()");
		
		List<?> list = hibernateTemplate.find("from Teacher");
		System.out.println(list);
		return 10;
	}

}
