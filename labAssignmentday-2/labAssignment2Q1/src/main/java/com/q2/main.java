package com.q2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student(109, "raj", 95), 95);
        map.put(new Student(61, "keta", 78), 78);
        map.put(new Student(11, "gunika", 98), 98);
        map.put(new Student(19, "keshav", 97), 97);


        System.out.println("------ 1. Sorted by Name ------");
        map.entrySet().stream()
                .sorted(Comparator.comparing(entry -> entry.getKey().getName()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));



        System.out.println("------ 2. Sorted by ID ------");
        map.entrySet().stream()
                .sorted(Comparator.comparing(entry -> entry.getKey().getId()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}

