package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class Greet {
    public void Part3(){
        List<ClassRoom> res = Data.ClassList().stream().filter(obj -> obj.getStudentList().isPresent())
                .collect(Collectors.toList());

        res.forEach(obj -> System.out.println(obj.getRoomId() + " -->  Hello Student"));
    }
}
