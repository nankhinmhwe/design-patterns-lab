package com.dp.factory;

import com.dp.factory.message.HTMLMessage;
import com.dp.factory.message.Message;

public class HTMLMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		
		return new HTMLMessage();
	}

}
