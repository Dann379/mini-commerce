package com.minicommerce.mini_commerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")

public class HealthController {

    @GetMapping("/health")
    public Map<String, Object> health(){
        Map<String, Object> res = new HashMap<>();
        res.put("status", "ok");
        res.put("timestamp", Instant.now().toString());
        return res;
    }
}
