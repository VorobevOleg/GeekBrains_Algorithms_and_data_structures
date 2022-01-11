package lesson8;

public class Main {

    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.add("Li", 1);
        hashTable.add("Po", 22);
        hashTable.add("Ko", 53);
        hashTable.add("No", 17);
        hashTable.add("Zi", 28);

        System.out.println(hashTable.remove("Li"));

    }
}
