package com.sohail.M0_CollectionsFramework;

import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        CustomCollection<Integer> list = new CustomCollection<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(Object x : list)
            System.out.println(x);
    }
}
