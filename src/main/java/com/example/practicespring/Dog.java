package com.example.practicespring;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
//    private String name;

    @Override
    public void say() {
        System.out.println("Bow-bow");
    }

    //нельзя параметризировать методы , все остальное можно
    public void init() {
        System.out.println("It`s init method");
    }

    public void destroy() {
        System.out.println("It`s destroy method");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
