package com.example.swagger.swaggertest;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@SecurityRequirement(name = "bearerAuth") // Applies to all endpoints in this controller
public class CompanyController {

    @GetMapping
    public List<String> getAllCompanies() {
        return List.of("Company A", "Company B", "Company C");
    }

    @PostMapping
    public String addCompany(@RequestBody String company) {
        return "Added: " + company;
    }
}
