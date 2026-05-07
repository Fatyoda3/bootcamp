package com.tw;

import com.tw.bootcamp.person.Person;

public class Main {

    void main() {
        Person person = new Person("name");
        String name = person.getName();
        System.out.println(name);

    }

    public static void printHello() {
        System.out.println("Hello World!");
    }

}