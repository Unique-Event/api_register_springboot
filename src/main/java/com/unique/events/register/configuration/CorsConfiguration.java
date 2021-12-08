package com.unique.events.register.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry participant) {
		participant.addMapping("/participants").allowedOrigins("http://localhost:3000").allowedMethods("GET", "POST",
				"PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
	}

}
