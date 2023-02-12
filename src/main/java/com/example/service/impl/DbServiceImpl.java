package com.example.service.impl;

import com.example.service.DbService;
import com.example.service.PrintService;
import com.hoverla.bring.annotation.Autowired;
import com.hoverla.bring.annotation.Bean;

@Bean
public class DbServiceImpl implements DbService {

	@Autowired
	private PrintService printService;

	@Override
	public void print() {
		System.out.println("DbServiceImpl....");
		printService.print();
	}

	@Autowired
	public void setPrintService(PrintService printService) {
		this.printService = printService;
	}
}
