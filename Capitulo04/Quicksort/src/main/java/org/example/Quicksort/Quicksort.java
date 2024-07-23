package org.example.Quicksort;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {

    public Quicksort(){}

    public static <T extends Comparable<T>> List<T> quicksort(List<T> list){
        if(list.size() < 2){
            return list;
        }else{
            int middle = list.size() / 2;
            T pivot = list.get(middle);
            List<T> left = new ArrayList<>();
            List<T> right = new ArrayList<>();

            for(int i = 0; i < list.size(); i++){
                if(i == middle) continue;
                T element = list.get(i);
                if(element.compareTo(pivot) <= 0){
                    left.add(element);
                }else {
                    right.add(element);
                }
            }
            List<T> resultLeft = quicksort(left);
            List<T> resultRight = quicksort(right);

            List<T> result = new ArrayList<>();

            result.addAll(resultLeft);
            result.add(pivot);
            result.addAll(resultRight);

            return result;
        }
    }
}
