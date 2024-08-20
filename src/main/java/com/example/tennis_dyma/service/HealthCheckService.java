package com.example.tennis_dyma.service;

import com.example.tennis_dyma.ApplicationStatus;
import com.example.tennis_dyma.HealthCheck;
import com.example.tennis_dyma.repository.HealthCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    private HealthCheckRepository healthCheckRepository;

    public HealthCheck healthCheck(){
        Long applicationConnections = healthCheckRepository.countApplicationConnections();
        if (applicationConnections > 0) {
            return new HealthCheck(ApplicationStatus.OK, "Welcome to Dyma Tennis!");
        } else {
            return new HealthCheck(ApplicationStatus.KO, "Dyma Tennis is not fully functional, please check your configuration.");
        }
    }
}
