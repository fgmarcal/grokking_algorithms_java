package Sort;

import java.util.ArrayList;
import java.util.List;

public class Sort {

    public Sort(){}
    private static int findLowestIndex(List<Integer> arr){
        int lowest = arr.getFirst();
        int lowestIndex = 0;

        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) < lowest){
                lowest = arr.get(i);
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }

    public static List<Integer> selectionSort(List<Integer> arr){
        List<Integer> newArr = new ArrayList<>();
        int lowest;
        for(var _ : arr){
            lowest = findLowestIndex(arr);
            newArr.add(arr.remove(lowest));
        }
        return newArr;
    }
}
