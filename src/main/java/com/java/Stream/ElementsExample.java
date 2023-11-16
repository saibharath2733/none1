package com.java.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsExample {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);
        List<Integer> nums1 = Arrays.asList(5,6,7,8);
        System.out.println(nums1);
        //normal for loop
        for(int i=0;i<nums1.size();i++){
            System.out.println(nums1.get(i));
        }
        // enhansed for loop
        for(int n:nums1){
            System.out.println(n);
        }
        // for each loop
        nums1.forEach(n-> System.out.println(n));
    }
}
