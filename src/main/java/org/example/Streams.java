package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args){
         Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };
         Stream<Employee> stream= Stream.of(arrayOfEmps);
//         stream.forEach((emp)->System.out.println(emp.getName()));
//         List<Employee> emp=stream.filter(e->e.getName().startsWith("Ma") || e.getName().startsWith("Bill")).collect(Collectors.toList());
        Employee emp=stream.filter(e->e.getName().contains("B")).findFirst().orElse(null);
         System.out.println(emp.getName());


    }
}