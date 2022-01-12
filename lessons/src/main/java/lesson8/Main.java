package lesson8;

public class Main {

    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.add("Li", 1);
        hashTable.add("Po", 22);
        hashTable.add("Ko", 52);
        hashTable.add("No", 17);
        hashTable.add("Zi", 28);

        hashTable.display();
        System.out.println("Уделено: " + hashTable.remove("Li"));
        System.out.println("----------");
        hashTable.display();

    }
}
