package com.stanbic.service.finacle.enquiry.service.exception;

public class OperationException extends BaseException {
	private static final long serialVersionUID = -8938158429134844665L;

	public OperationException(String message) {
		super(message);
	}

	public OperationException(String message, Throwable cause) {
		super(message, cause);
	}

	public OperationException(Throwable cause) {
		super(cause);
	}
}
