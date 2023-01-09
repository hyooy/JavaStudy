package com.example.listener;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {   //需要继承ApplicationEvent
    public TestEvent(Object source) {
        super(source);
    }
}