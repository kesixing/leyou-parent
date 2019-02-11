package com.leyou.common.enums;

public enum ExceptiomEnum {
	PRICE_NOT_BE_NULL(400,"价格不能为空"),
	;

	private int code;
	
	private String message;
	
	ExceptiomEnum(int code, String message){
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	
}
