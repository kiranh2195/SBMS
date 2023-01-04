package com.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleAE(ArithmeticException ae) {

		ExceptionInfo excpetion = new ExceptionInfo();

		excpetion.setMsg(ae.getMessage());
		excpetion.setCode("SBI0004");

		return new ResponseEntity<ExceptionInfo>(excpetion, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value=NoDataFoundException.class)
	public ResponseEntity<ExceptionInfo> handleNdfe(NoDataFoundException ndfe){
		ExceptionInfo excpetion = new ExceptionInfo();

		excpetion.setMsg(ndfe.getMessage());
		excpetion.setCode("NDFE0005");
		
		return new ResponseEntity<ExceptionInfo>(excpetion,HttpStatus.BAD_REQUEST);
	}
}
