package com.example.productservice.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {
// to customize OpenAPI documentation, including the server URLs used by Swagger UI when executing API requests.
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .servers(List.of(
//                        new Server().url("/")
//                ));
//    }
}