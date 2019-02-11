package com.leyou.common.exception;

import com.leyou.common.enums.ExceptiomEnum;

public class LyException extends RuntimeException {

	private static final long serialVersionUID = 1574286964360242115L;

	private ExceptiomEnum exceptiomEnum;

	public LyException() {
		super();
	}

	public LyException(ExceptiomEnum exceptiomEnum) {
		this.exceptiomEnum = exceptiomEnum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ExceptiomEnum getExceptiomEnum() {
		return exceptiomEnum;
	}

}
