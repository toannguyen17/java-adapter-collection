package com.codegym;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> setA = new TreeSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(6);
        setA.add(10);

        CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter();
        List<Integer> list = collectionUtilsAdapter.adapter(setA);

        CollectionUtils collectionUtils = new CollectionUtils();

        int max = collectionUtils.findMax(list);

        System.out.println(list);
        System.out.println("Max: " + max);
    }
}
