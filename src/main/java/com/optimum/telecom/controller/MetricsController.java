package com.optimum.telecom.controller;

import com.optimum.telecom.model.OperationalMetrics;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/operational")
public class MetricsController {

    @GetMapping("/metrics")
    public OperationalMetrics getOperationalMetrics() {
        Map<String, Integer> tickets = new HashMap<>();
        tickets.put("CRITICAL", 2);
        tickets.put("HIGH", 12);
        tickets.put("MEDIUM", 45);
        tickets.put("LOW", 128);

        return OperationalMetrics.builder()
                .deploymentCount(24)
                .activeAgents(1540)
                .customerSentimentScore(4.8)
                .systemLoadAverage(0.65)
                .ticketSummary(tickets)
                .timePeriod("Last 24 Hours")
                .build();
    }
}
