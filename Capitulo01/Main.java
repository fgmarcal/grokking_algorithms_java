import binarySearch.Binary;
import linearSearch.Linear;

public class Main {
    
    public static void main(String[] args) {
        
        //searching numbers
        int[] orderedList = {1,2,3,4,5,6,7,8,9,10};
        int[] unorderedList = {3,5,9,4,1,7,8,10,2,6};

        int number = (int)(Math.random()*10);

        System.out.println("Busca Linear / Linear Search");
        System.out.println("Número buscado: " + number + "\n");

        var ordered = Linear.search(orderedList, number);
        System.out.println("Posição da lista ordenada: " + ordered);

        var unordered = Linear.search(unorderedList, number);
        System.out.println("Posição da lista desordenada: " + unordered);

        //searching strings
        String[] orderedNameList = {"Angélica", "Brenda", "Caio", "Dora", "Eduardo", "Felipe", "Gabriela", "Helio", "Ítalo", "José"};
        String[] unorderedNameList = {"Helio", "Ítalo", "Eduardo", "José", "Angélica", "Caio", "Felipe", "Brenda", "Dora", "Gabriela"};

        int posicaoNome = (int)(Math.random()*9);

        var nome = orderedNameList[posicaoNome];
        System.out.println("\nNome buscado " + nome);

        var orderName = Linear.search(orderedNameList, nome);
        System.out.println("Posição lista ordenada: " + orderName);

        var unorderedName = Linear.search(unorderedNameList, nome);
        System.out.println("Posição lista desordenada: " + unorderedName);


        System.out.println("\nBusca Binária / Binary Search - apenas lista ordenada");
        var binary = Binary.search(orderedList, number);
        System.out.println("Posição: " + binary);

        System.out.println("\nNome buscado " + nome);
        var binaryName = Binary.search(orderedNameList, nome);
        System.out.println("Posição: " + binaryName);

        System.out.println("\nquando nome não existe");
        var noValueLinear = Linear.search(orderedList, 90);
        System.out.println(noValueLinear);
        var noValueBinary = Binary.search(orderedNameList, "null");
        System.out.println(noValueBinary);

    }
}
