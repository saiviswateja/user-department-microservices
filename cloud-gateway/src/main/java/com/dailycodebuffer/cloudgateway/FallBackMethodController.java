package com.dailycodebuffer.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
    @GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        return "Userservices taking longer than expected. Please try again later";
    }
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "departmentServices taking longer than expected. Please try again later";
    }
}
