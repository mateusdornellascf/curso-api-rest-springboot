package br.com.mateusdornellascf.projeto_api_rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPIConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("REST API´s RESTful  from 0  with Java, Springboot, Kubernets and Docker").version("v3")
                .description(
                        "API RESTful developed in Springboot to demonstrate the creation of a complete project with CRUD operations, documentation with OpenAPI/Swagger, HATEOAS implementation, and integration with Docker and Kubernetes for containerization and orchestration.")
                .termsOfService(null).license(new License()
                        .name("Apache 2.0")
                        .url("http://springdoc.org")));
    }
}
