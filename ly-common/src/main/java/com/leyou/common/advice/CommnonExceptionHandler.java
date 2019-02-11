package com.leyou.common.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.leyou.common.exception.LyException;
import com.leyou.common.vo.ExceptionResult;

@ControllerAdvice
public class CommnonExceptionHandler {

	@ExceptionHandler(LyException.class)
	public ResponseEntity<ExceptionResult> handleException(LyException e){
		ExceptionResult exceptionResult = new ExceptionResult(e.getExceptiomEnum());
		return ResponseEntity.status(e.getExceptiomEnum().getCode()).body(exceptionResult);
	}
}
