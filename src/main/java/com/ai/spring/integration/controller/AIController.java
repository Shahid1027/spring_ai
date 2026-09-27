package com.ai.spring.integration.controller;

import com.ai.spring.integration.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/summarize")
    public String summarize(@RequestBody String prompt) {
        return aiService.summarize(prompt);
    }
}