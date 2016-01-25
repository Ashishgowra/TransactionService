package org.ashish.assessment.transactionservice.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMsg {
	private String errorMsg;
	private int errorCode;
	
	public ErrorMsg(){}
	
	public ErrorMsg(String msg, int code){
		this.errorMsg = msg;
		this.errorCode = code;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
