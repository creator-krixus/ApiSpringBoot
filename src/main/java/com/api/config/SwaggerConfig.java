package com.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2

//Para ver la documentacion de la API ingresar en la siguiente url
//localhost:8080/v2/api-docs

//Para ver la documentacion en una interfaz grafica ingresamos a la url
//localhost:8080/swagger-ui.html

public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.api.rest"))
				.paths(PathSelectors.any())
				.build();
	}

}
