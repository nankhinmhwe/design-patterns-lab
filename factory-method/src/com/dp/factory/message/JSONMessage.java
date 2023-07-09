package com.dp.factory.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "JSON:: {message : \"Getting JSON Message\"}";
	}
}
