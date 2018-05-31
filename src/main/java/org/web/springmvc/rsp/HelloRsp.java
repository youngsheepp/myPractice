package org.web.springmvc.rsp;

import java.io.Serializable;

public class HelloRsp implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4539472058970846592L;
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
