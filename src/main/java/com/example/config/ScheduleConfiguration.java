package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@Configuration
public class ScheduleConfiguration {
    @Scheduled(fixedRate = 3000)
    public void test(){
        System.out.println(new Date());
    }
}
