package com.knoldus;


public class Main {

    public static void main(String[] args) {

        System.out.println("Part 1:");

        NoSubjects instance1 = new NoSubjects();
        System.out.println(instance1.Part1());

        System.out.println("Part 2:");

        UniqueId instance2 = new UniqueId();
        System.out.println(instance2.Part2());

        System.out.println("Part 3:");

        Greet instance3 = new Greet();
        instance3.Part3();
    }

}


