import HashTable.HashTable;

public class Main {
    public static void main(String[] args) {

        HashTable<String, Double> myTable = new HashTable<String, Double>();

        myTable.put("Pizza", 15.00);
        myTable.put("Pepperoni", 20.00);
        myTable.put("Muzzarella", 30.00);
        myTable.put("Cheese", 40.00);
        myTable.put("Tomato", 50.00);

        System.out.println(myTable.get("Pizza"));


    }
}
