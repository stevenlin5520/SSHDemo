package com.steven.ssh.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.steven.ssh.dto.Teacher;
import com.steven.ssh.service.TeacherService;

public class TeacherAction extends ActionSupport implements ModelDriven<Teacher>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private TeacherService service;
	
	public TeacherService getService() {
		return service;
	}

	public void setService(TeacherService service) {
		this.service = service;
	}

	public String insert() {
		System.out.println("进入TeacherAction的insert方法");
		service.insert();
		return "success";
	}

	@Override
	public Teacher getModel() {
		System.out.println("TeacherAction.getModel()");
		return null;
	}
}
