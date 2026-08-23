package com.ai.spring.integration.controller;

import com.ai.spring.integration.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @PostMapping("/ask")
    public String ask(@RequestBody String prompt) {
        return aiService.ask(prompt);
    }
}