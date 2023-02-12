package com.example;

import com.example.service.*;
import com.hoverla.bring.BringApplication;
import com.hoverla.bring.context.ApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new BringApplication.ApplicationContextBuilder().packagesToScan("com.example")
				.build();

//		var applicationContext = new AnnotationApplicationContext("com.example");
//		ApplicationContext applicationContext = context.run();

		WeekDayComponent bean = applicationContext.getBean(WeekDayComponent.class);
		bean.getWeekDay();
		HelloComponent bean1 = applicationContext.getBean(HelloComponent.class);
		bean1.sayHello();

		DbService dbService = applicationContext.getBean(DbService.class);
		dbService.print();

		PrintService printService = applicationContext.getBean(PrintService.class);
		printService.print();

		UnknowService unknowService = applicationContext.getBean(UnknowService.class);
		unknowService.print();
	}
}
