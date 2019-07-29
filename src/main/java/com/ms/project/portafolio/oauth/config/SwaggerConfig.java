package com.ms.project.portafolio.oauth.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author German Vazquez Renteria
 * Date:  28 jul. 2019
 * Package Name: com.ms.project.portafolio.app.productos.config
 * Project Name: ms-productos
 */
@Configuration
@EnableSwagger2
@Controller
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(
//						RequestHandlerSelectors.basePackage("com.ms.project.portafolio.oauth")
						RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("Portafolio MS Oauth Api's",
				"Desarrollo de portafolio con Microservicios con Arquitectura Netflix OSS", "0.1.0",
				"Terminos del Servicio",
				new Contact("German Vazquez Renteria", "https://github.com/GermanVR", "german_1241@hotmail.com"),
				"License of API", "API license URL", Collections.emptyList());
	}

	@GetMapping("/")
	public String home() {
		return "redirect:/swagger-ui.html";
	}

}
