package org.example;

import org.example.Quicksort.Quicksort;

import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(11);
        list.add(7);
        list.add(8);
        list.add(99);
        list.add(45);
        list.add(23);
        list.add(22);
        list.add(12);
        list.add(100);
        list.add(89);
        list.add(2);

        var result = Quicksort.quicksort(list);

        System.out.println(result);



    }
}