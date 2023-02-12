package com.example.config;

import com.example.service.PrintService;
import com.example.service.impl.PrintServiceImpl;
import com.hoverla.bring.annotation.Bean;

@com.hoverla.bring.annotation.Configuration
public class Configuration {

	@Bean
	public PrintService printService() {
		return new PrintServiceImpl();
	}
}
