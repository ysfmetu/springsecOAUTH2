package com.imerasoft.springsecoauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/* Created by yusufulku,29.07.2025 */
@Controller
public class secureController {
    @GetMapping("/secure")
    public String securePage() {
        return "secure.html";
    }
}
