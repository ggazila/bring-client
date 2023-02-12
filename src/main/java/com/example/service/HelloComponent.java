package com.example.service;


import com.hoverla.bring.annotation.Autowired;
import com.hoverla.bring.annotation.Bean;

@Bean
public class HelloComponent {
    @Autowired
    private WeekDayComponent weekDayComponent;
    
    public void sayHello() {
        System.out.println("Hello, today is " + weekDayComponent.getWeekDay());
    }
}