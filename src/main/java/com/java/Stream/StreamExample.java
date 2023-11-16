package com.java.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);
        //nums.stream().filter(n->n%2==0).map(i->i*2).forEach(i-> System.out.println(i));
        //nums.stream().sorted().forEach(i-> System.out.println(i));
        //nums.stream().sorted(Comparator.reverseOrder()).forEach(i-> System.out.println(i));
        Stream<Integer> a=nums.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1);
        a.forEach(n-> System.out.println(n));
        List<Integer> nums1 = Arrays.asList(10,11,12,13,14);
        nums1.stream().peek(n-> System.out.println("Before"+n)).map(n->n*2).peek(n-> System.out.println("After"+n)).collect(Collectors.toList());
        //Stream<Integer> data = nums.stream();
        //Stream<Integer> data1=data.map(n->n*2);
        //Long count = data.count();
        //System.out.println(count);
        //data1.forEach(n-> System.out.println(n));
    }
}
