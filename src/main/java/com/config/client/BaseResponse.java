package com.config.client;

import java.io.Serializable;


public class BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String status;

	private String errorCode;

	private int errorId;

	private String errorDescription;
	
	private String externalId;
	
	private static final String FAILURE= "FAILURE";
	
	

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public int getErrorId() {
		return errorId;
	}

	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BaseResponse [status=");
		builder.append(status);
		builder.append(", errorCode=");
		builder.append(errorCode);
		builder.append(", errorId=");
		builder.append(errorId);
		builder.append(", errorDescription=");
		builder.append(errorDescription);
		builder.append(", externalId=");
		builder.append(externalId);
		builder.append("]");
		return builder.toString();
	}

	

}
