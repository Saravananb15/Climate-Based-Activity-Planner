package com.SpringAI.OpenAI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringAI.Model.Prompt;
import com.SpringAI.OpenAI.Service.OpenAIServiceImpl;


@RestController
public class OpenAIController {

	@Autowired
	OpenAIServiceImpl openAiServiceimpl;
	
	
	@PostMapping("/Quotes")
	public String generateQuotes(@RequestParam String prompt) {
		return openAiServiceimpl.generateQuotes(prompt);
	}
}
