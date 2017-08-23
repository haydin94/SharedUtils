package de.services.exceptions;

public class FailedToLoadException extends Exception {

	public FailedToLoadException(String message) {
		super(message);
	}

	public FailedToLoadException() {
		super();
	}

}
