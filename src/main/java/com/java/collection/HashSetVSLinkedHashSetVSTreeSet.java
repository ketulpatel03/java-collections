package com.java.collection;

import java.util.*;

public class HashSetVSLinkedHashSetVSTreeSet {

    public static void main(String[] args) {

        int elements = 1000000;

        // HashSet
        long startTime = System.nanoTime();
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= elements; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet time: " + (endTime - startTime));

        // LinkedHashSet
        long startTime2 = System.nanoTime();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 1; i <= elements; i++) {
            linkedHashSet.add(i);
        }
        long endTime2 = System.nanoTime();
        System.out.println("LinkedHashSet time: " + (endTime2 - startTime2));

        // TreeSet
        long startTime3 = System.nanoTime();
        SortedSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i <= elements; i++) {
            treeSet.add(i);
        }
        long endTime3 = System.nanoTime();
        System.out.println("TreeSet time: " + (endTime3 - startTime3));

    }

}
