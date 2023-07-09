package com.dp.factory.message;

public abstract class Message {
	
	public abstract String getContent();
	
	public void addDefaultHeaders() {
		// add some headers
	}
	
	public void encrypt() {
		// encrypt
	}

}
