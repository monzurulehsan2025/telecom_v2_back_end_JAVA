package com.optimum.telecom.controller;

import com.optimum.telecom.model.PlatformStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/platform")
public class PlatformController {

    @GetMapping("/status")
    public List<PlatformStatus> getPlatformStatus() {
        return Arrays.asList(
                PlatformStatus.builder()
                        .platformName("One Agent")
                        .status("HEALTHY")
                        .latencyMs(45.2)
                        .version("2.4.0-stable")
                        .uptimeSeconds(1254000L)
                        .build(),
                PlatformStatus.builder()
                        .platformName("Lightspeed")
                        .status("HEALTHY")
                        .latencyMs(32.8)
                        .version("1.12.5-prod")
                        .uptimeSeconds(856200L)
                        .build(),
                PlatformStatus.builder()
                        .platformName("Customer Billing Gateway")
                        .status("DEGRADED")
                        .latencyMs(250.4)
                        .version("v4.0")
                        .uptimeSeconds(45200L)
                        .build());
    }
}
