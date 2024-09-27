package com.practice.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class GetYoungestPerson {
    private String name;
    private int age;

    public GetYoungestPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<GetYoungestPerson> data = Arrays.asList(new GetYoungestPerson("Alice",23),
                new GetYoungestPerson("Abhi", 26),
                new GetYoungestPerson("Santosh", 27));

        String youngest = data.stream()
                .min(Comparator.comparingInt(GetYoungestPerson::getAge))
                .map(GetYoungestPerson::getName)
                .orElse(null);
        System.out.println("Youngest Person From the List:" +youngest);

        String eldest = data.stream()
                .max(Comparator.comparingInt(GetYoungestPerson::getAge))
                .map(GetYoungestPerson::getName)
                .orElse(null);
        System.out.println("Eldest Person from the List: " +eldest);
    }
}
