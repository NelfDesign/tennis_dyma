package com.example.tennis_dyma.rest;

import com.example.tennis_dyma.HealthCheck;
import com.example.tennis_dyma.service.HealthCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Autowired
    private HealthCheckService healthCheckService;

    @GetMapping("/healthcheck")
    public HealthCheck healthCheck(){
        return healthCheckService.healthCheck();
    }
}
