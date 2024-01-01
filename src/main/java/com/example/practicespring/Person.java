package com.example.practicespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    //    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.surname}")
    private String lastName;
    @Value("${person.age}")
    private int age;

//    public Person() {
//    }

    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }

    public Pet getPet() {
        return pet;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
