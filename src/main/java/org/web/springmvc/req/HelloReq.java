package org.web.springmvc.req;

import java.io.Serializable;

public class HelloReq implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5948356359154902331L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
