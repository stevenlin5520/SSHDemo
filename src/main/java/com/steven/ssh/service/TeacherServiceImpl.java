package com.steven.ssh.service;

import com.steven.ssh.dao.TeacherDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherDao teacherDao;

//	public void setTeacherDao(TeacherDao teacherDao) {
//		this.teacherDao = teacherDao;
//	}
//
//	public TeacherDao getTeacherDao() {
//		return teacherDao;
//	}

	@Override
	public int insert() {
		System.out.println("TeacherServiceImpl.insert()");
		
		int count = teacherDao.insert();
		if(teacherDao.insert() > 0){
			return count;
		}
		return 0;
	}

}
