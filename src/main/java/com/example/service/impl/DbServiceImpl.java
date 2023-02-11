package com.example.service.impl;

import com.breskul.bring.annotations.Autowired;
import com.breskul.bring.annotations.Component;
import com.example.service.DbService;
import com.example.service.PrintService;

@Component
public class DbServiceImpl implements DbService {
	@Autowired
	private PrintService printService;

	@Override
	public void print() {
		System.out.println("DbServiceImpl....");
		printService.print();
	}
}
