package com.sample.telecom.controller;

import com.sample.telecom.model.PlatformStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/platform")
public class PlatformController {

    @GetMapping("/status")
    public List<PlatformStatus> getPlatformStatus() {
        List<PlatformStatus> statuses = new ArrayList<>();
        String[] possibleStatuses = { "HEALTHY", "DEGRADED", "OFFLINE" };

        for (int i = 1; i <= 20; i++) {
            String platformName = "Platform-" + i;
            if (i == 1)
                platformName = "One Agent";
            else if (i == 2)
                platformName = "Lightspeed";
            else if (i == 3)
                platformName = "Customer Billing Gateway";

            String status = possibleStatuses[(i - 1) % possibleStatuses.length];
            if (i <= 2)
                status = "HEALTHY";
            else if (i == 3)
                status = "DEGRADED";

            statuses.add(PlatformStatus.builder()
                    .platformName(platformName)
                    .status(status)
                    .latencyMs(10 + (Math.random() * 200))
                    .version("v" + i + ".0")
                    .uptimeSeconds(10000L + (long) (Math.random() * 1000000))
                    .build());
        }
        return statuses;
    }
}
