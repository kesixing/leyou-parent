package com.leyou.common.vo;

import com.leyou.common.enums.ExceptiomEnum;

public class ExceptionResult {

	private int status;
	private String message;
	private long timestamp;
	
	public ExceptionResult(int status, String message) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = System.currentTimeMillis();
	}
	
	public ExceptionResult(ExceptiomEnum exceptiomEnum) {
		this.status = exceptiomEnum.getCode();
		this.message = exceptiomEnum.getMessage();
		this.timestamp = System.currentTimeMillis();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
}
