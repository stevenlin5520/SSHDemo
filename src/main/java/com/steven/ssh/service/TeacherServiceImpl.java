package com.steven.ssh.service;

import com.steven.ssh.dao.TeacherDao;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class TeacherServiceImpl implements TeacherService {

	private TeacherDao teacherDao;
//	使用Spring创建Dao
	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

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
