package com.example.service;


import com.hoverla.bring.annotation.Bean;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Bean
public class WeekDayComponent {
    public String getWeekDay() {
        return LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}