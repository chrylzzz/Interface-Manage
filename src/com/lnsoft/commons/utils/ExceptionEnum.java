package com.lnsoft.commons.utils;


/**
 * 自定义枚举返回
 * @author Chr
 *
 */
public enum ExceptionEnum {

	PARAMETER_ERROR("A-001","参数异常"),
	LOGIN_ERROR("B-001","登陆异常");
	
	private String errorCode;
	private String errorMessage;
	
	private ExceptionEnum(String errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	
}
