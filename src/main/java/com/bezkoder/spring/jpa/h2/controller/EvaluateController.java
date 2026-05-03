package com.bezkoder.spring.jpa.h2.controller;

import com.bezkoder.spring.jpa.h2.model.EvaluateRequest;
import com.bezkoder.spring.jpa.h2.model.EvaluateResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EvaluateController {

    @PostMapping("/evaluate")
    public EvaluateResponse evaluate(@RequestBody EvaluateRequest request) {

        String prompt = request.getPrompt();

        String responseA = "This is Response A for: " + prompt;
        String responseB = "This is Response B for: " + prompt;

        return new EvaluateResponse(responseA, responseB);
    }
}