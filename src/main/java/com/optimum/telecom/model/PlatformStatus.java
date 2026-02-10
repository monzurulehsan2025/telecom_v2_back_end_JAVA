package com.optimum.telecom.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlatformStatus {
    private String platformName;
    private String status;
    private double latencyMs;
    private String version;
    private long uptimeSeconds;
}
