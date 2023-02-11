package com.example;

import com.breskul.bring.AnnotationConfigApplicationContext;
import com.example.service.DbService;
import com.example.service.PrintService;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext("com.example");
		PrintService bean = context.getBean(PrintService.class);
		bean.print();
		DbService dbService = context.getBean(DbService.class);
		dbService.print();
	}
}
