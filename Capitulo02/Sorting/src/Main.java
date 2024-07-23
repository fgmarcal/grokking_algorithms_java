import Sort.Sort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(6);
        integerList.add(5);
        integerList.add(3);
        integerList.add(2);

        System.out.println("#### ORDENAÇÃO DE INTS");
        System.out.println(integerList);
        var integerResult = Sort.selectionSort(integerList);
        System.out.println(integerResult);

        System.out.println("#### ORDENAÇÃO DE STRINGS");

        List<String> stringList = new ArrayList<>();
        stringList.add("Felipe");
        stringList.add("Dora");
        stringList.add("José");
        stringList.add("Angelica");
        stringList.add("Brenda");

        System.out.println("\n"+stringList);
        var stringResult = Sort.selectionSort(stringList);
        System.out.println(stringResult);

    }
}