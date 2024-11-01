package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args){
         Employee[] arrayOfEmps = {
                 new Employee(1, "Jeff Bezos", 100000.0),
                 new Employee(2, "Bill Gates", 200000.0),
                 new Employee(3, "Mark Zuckerberg", 300000.0),
                 new Employee(4,"Steve Jobs",400000.0)
        };
         Stream<Employee> stream= Stream.of(arrayOfEmps);
//         stream.forEach((emp)->System.out.println(emp.getName()));
//         List<Employee> emp=stream.filter(e->e.getName().startsWith("Ma") || e.getName().startsWith("Bill")).collect(Collectors.toList());
//        Employee emp=stream.filter(e->e.getName().contains("B")).findFirst().orElse(null);
//        stream.peek(e->System.out.println(e.getSalary())).collect(Collectors.toList());
//         System.out.println(emp.getName());
//
//        List<String> list= Arrays.asList("999999999","987654321","888");
//        IntStream longStream=list.stream().mapToInt(Integer::parseInt);
//        System.out.println(longStream.count());
//        stream.sorted(Comparator.comparing(Employee::getSalary)).forEach(e-> System.out.println(e.getName()));
//        Employee emp=stream.max(Comparator.comparing(Employee::getSalary)).orElse(null);
//        System.out.println(emp.getName());
//        List<Integer> list=Arrays.asList(1,2,3,4,2,1,3,5,8);
//        list.stream().distinct().forEach(System.out::println);
//        Integer n= list.stream().mapToInt(Integer::intValue).reduce(0,Integer::sum);

//        Integer count=Integer.bitCount(9999);
//        System.out.println(count);
//        String names=stream.map(Employee::getName).collect(Collectors.joining(", "));
//        System.out.println(names);

//        Map<Character,List<Employee>> map=stream.collect(Collectors.groupingBy(e->new Character(e.getName().charAt(0))));
//        System.out.println(map.get('M').get(1).getName());


    }
}
