package com.example.service.impl;

import com.example.service.DbService;
import com.example.service.PrintService;
import com.hoverla.bring.annotation.Autowired;
import com.hoverla.bring.annotation.Bean;

@Bean
public class PrintServiceImpl implements PrintService {
	@Autowired
	private DbService dbService;

	@Override
	public void print() {
//		dbService.print();
		System.out.println("PrintServiceImpl....");
	}
}
