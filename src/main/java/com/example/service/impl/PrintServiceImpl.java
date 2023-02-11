package com.example.service.impl;

import com.breskul.bring.annotations.Autowired;
import com.breskul.bring.annotations.Component;
import com.example.service.DbService;
import com.example.service.PrintService;

@Component
public class PrintServiceImpl implements PrintService {
	@Autowired
	private DbService dbService;

	@Override
	public void print() {
		dbService.print();
		System.out.println("PrintServiceImpl....");
	}
}
