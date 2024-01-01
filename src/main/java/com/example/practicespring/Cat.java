package com.example.practicespring;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Mya - may");
    }
}
