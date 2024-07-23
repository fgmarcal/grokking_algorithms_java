package Sort;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    private static <T extends Comparable<T>> int findLowestIndex(List<T> arr) {
        T lowest = arr.get(0);
        int lowestIndex = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).compareTo(lowest) < 0) {
                lowest = arr.get(i);
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> arr) {
        List<T> newArr = new ArrayList<>();
        int size = arr.size();
        int lowest;
        T temp;

        while (size > 0) {
            lowest = findLowestIndex(arr);
            temp = arr.get(lowest);
            newArr.add(temp);
            arr.remove(lowest);
            size--;
        }
        return newArr;
    }

}
