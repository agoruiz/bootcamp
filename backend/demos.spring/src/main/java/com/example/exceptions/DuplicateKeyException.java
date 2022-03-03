package com.example.exceptions;

import java.io.Serializable;

public class DuplicateKeyException extends Exception implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public DuplicateKeyException() {
		this("Duplicate Key");
	}

	public DuplicateKeyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(Throwable cause) {
		super("Duplicate Key", cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
