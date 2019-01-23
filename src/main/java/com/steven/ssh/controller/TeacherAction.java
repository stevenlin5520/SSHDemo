package com.steven.ssh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.steven.ssh.dto.Teacher;
import com.steven.ssh.service.TeacherService;

@Controller
public class TeacherAction extends ActionSupport implements ModelDriven<Teacher>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private TeacherService teacherService;
	
	/*public TeacherService getService() {
		return service;
	}

	public void setService(TeacherService service) {
		this.service = service;
	}*/

	public String insert() {
		System.out.println("进入TeacherAction的insert方法");
		teacherService.insert();
		return "success";
	}

	@Override
	public Teacher getModel() {
		System.out.println("TeacherAction.getModel()");
		return null;
	}
}
