package com.example.mdbackend.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Api(tags = "Hello", description = "Sample hello endpoint")
public class HelloController {

    @GetMapping("/hello")
    @ApiOperation(value = "Get hello message", notes = "Returns a hello message")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved message")
    })
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello from Spring Boot!");
        return response;
    }
} 