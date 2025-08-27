package com.sateekot.codereview.controller;

import com.sateekot.codereview.service.CodeReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeReviewController {
    private final Logger
        logger = LoggerFactory.getLogger(getClass());

    @Autowired
    CodeReviewService codeReviewService;

    @GetMapping("/")
    public String home() {

        codeReviewService.review();
        return "Code Review Application";
    }
}