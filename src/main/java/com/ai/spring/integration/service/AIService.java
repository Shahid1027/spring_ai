package com.ai.spring.integration.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class AIService {

	/*
	 * private final ChatModel chatModel;
	 * 
	 * public AIService(ChatModel chatModel) { this.chatModel = chatModel; }
	 * 
	 * public String ask(String prompt) { return chatModel.call(prompt); }
	 */
	
	private ChatClient chatClient;
	
	public AIService(ChatClient.Builder builder) {
		this.chatClient = builder.build();
	}
	
	public String summarize(String ticket) {
		String output = chatClient.prompt()
				.user("summarize in 2 lines" + ticket)
				.call()
				.content();
		
		return output;
	}
}