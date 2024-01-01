package com.example.practicespring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    // Dependency Injection внедрение зависимости с помощью конструктора
    // Dependency Injection внедрение зависимости с помощью setter изменения в applicationContext.xml
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        Pet pet = context.getBean("myPet", Pet.class);

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

//        System.out.println(person.getName());
//        System.out.println(person.getLastName());
//        System.out.println(person.getAge());

        context.close();
    }
}
