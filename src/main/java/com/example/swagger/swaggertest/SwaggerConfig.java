package com.example.swagger.swaggertest;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        // Define the security scheme
        SecurityScheme securityScheme = new SecurityScheme()
                .type(SecurityScheme.Type.HTTP)
                .scheme("bearer")
                .bearerFormat("JWT"); // Use "basic" if you want Basic Auth

        // Add security scheme to components
        Components components = new Components()
                .addSecuritySchemes("bearerAuth", securityScheme);

        // Add the security requirement to the OpenAPI doc
        SecurityRequirement securityRequirement = new SecurityRequirement()
                .addList("bearerAuth");

        return new OpenAPI()
                .components(components)
                .addSecurityItem(securityRequirement)
                .info(new Info()
                        .title("E-Stock Market API")
                        .version("1.0")
                        .description("API documentation for the E-Stock Market application with JWT authentication"));
    }
}
