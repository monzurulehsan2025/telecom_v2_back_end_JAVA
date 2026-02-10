package com.sample.telecom.model;

import lombok.Builder;
import lombok.Data;
import java.util.Map;

@Data
@Builder
public class OperationalMetrics {
    private int deploymentCount;
    private int activeAgents;
    private double customerSentimentScore;
    private double systemLoadAverage;
    private Map<String, Integer> ticketSummary;
    private String timePeriod;
}
