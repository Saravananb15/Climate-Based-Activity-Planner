package com.SpringAI.OpenAI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ai.client.AiClient;
import org.springframework.ai.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

import com.SpringAI.Model.Prompt;

@Service
public class OpenAIServiceImpl implements OpenAIService {
	@Autowired
	AiClient aiClient;

	@Override
	public String generateQuotes(String prompt){
        PromptTemplate promptTemplate = new PromptTemplate(prompt);
        return this.aiClient.generate(promptTemplate.create()).getGeneration().getText();
    }
}
