package com.demo.wrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WrapperListDemo {

    public static void main(String[] args) {

        // 1. Create List of Wrapper Class (Integer)
        List<Integer> list = new ArrayList<>();

        // 2. Insert elements
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        System.out.println("After Insertion: " + list);

        // 3. Delete element (by value & index)
        list.remove(Integer.valueOf(40)); // remove value
        list.remove(0); // remove index

        System.out.println("After Deletion: " + list);

        // 4. Search element
        int searchElement = 30;
        if (list.contains(searchElement)) {
            System.out.println(searchElement + " found in list");
        } else {
            System.out.println(searchElement + " not found");
        }

        // 5. Iterate elements

        // a) Using for-each
        System.out.print("Iteration (for-each): ");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        // b) Using for loop
        System.out.print("Iteration (for loop): ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 6. Sort elements
        Collections.sort(list);
        System.out.println("After Sorting: " + list);
    }
}
