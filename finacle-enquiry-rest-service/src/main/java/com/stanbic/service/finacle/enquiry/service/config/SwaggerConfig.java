package com.stanbic.service.finacle.enquiry.service.config;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Abayomi
 */

@Configuration
@EnableSwagger2
@Profile("!prod")
public class SwaggerConfig {

	@Value("${app.version}")
	private String applicationVersion = "1.0.0";
	@Value("${app.description}")
	private String applicationDescription;
	@Value("${app.name}")
	private String applicationName;

	@Bean
	public Docket createDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.stanbic.service.finacle.enquiry.service.controller"))
				.paths(PathSelectors.any()).build().apiInfo(createApiInfo())
				.pathMapping("");
	}

	private ApiInfo createApiInfo() {
		return new ApiInfo(applicationName, applicationDescription, applicationVersion, "",
				new Contact("Stanbic IBTC Bank Plc", "https://www.stanbicibtc.com", "info@stanbicibtc.com"), "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
	}

}