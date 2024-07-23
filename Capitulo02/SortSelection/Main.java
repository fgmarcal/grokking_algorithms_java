import java.util.ArrayList;
import java.util.List;
import Sort.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> teste = new ArrayList<>();
        teste.add(1);
        teste.add(5);
        teste.add(3);
        teste.add(2);

        var result = Sort.selectionSort(teste);
        System.out.println(result);
    }
}
