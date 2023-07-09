package com.dp.factory;

import com.dp.factory.message.JSONMessage;
import com.dp.factory.message.Message;

public class JSONMessageCreator extends MessageCreator{

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

}
