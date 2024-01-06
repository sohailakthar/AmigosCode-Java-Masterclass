package com.sohail.CollectionsFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.addAll(List.of(5, 6, 7, 2));
        list2.addAll(list1);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        List<Integer> list3 = list2.subList(2, 6);
        list3.set(2, 100);  // Changes in both list2 and list3

        System.out.println("List2: " + list2);
        System.out.println("List3: " + list3);

        System.out.println("Index of 2 in list2: " + list2.indexOf(2));
        System.out.println("LastIndex of 2 in list2: " + list2.lastIndexOf(2));

        System.out.println("list2 contains 6? " + list2.contains(6));

        System.out.println("Item at index-3 in list2: " + list2.get(3));

        list2.sort((a,b) -> a-b);
        System.out.println("After sorting list2: " + list2);

        list2.clear();
        System.out.println("After clearing list2: " + list2);
    }
}
