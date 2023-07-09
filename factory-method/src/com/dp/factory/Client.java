package com.dp.factory;

import com.dp.factory.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new HTMLMessageCreator());
		
		printMessage(new JSONMessageCreator());

	}

	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg.getContent());
	}
}
