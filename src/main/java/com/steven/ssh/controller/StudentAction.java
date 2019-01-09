package com.steven.ssh.controller;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("进入StudentAction控制器的execute()方法!");
		
		return super.execute();
	}

}
