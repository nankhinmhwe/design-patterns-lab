package com.dp.factory;

import com.dp.factory.message.Message;

/**
 * 
 * createMessage() has to be implemented by subclass
 *
 */
public abstract class MessageCreator {
	
	public Message getMessage() {
		Message msg = createMessage();
		msg.addDefaultHeaders();
		msg.encrypt();
		return msg;
	}
	
	// Factory Method
	public abstract Message createMessage();

}
