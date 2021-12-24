package lesson5;

import java.util.*;

public class Main {

    public static int maxKnapsackWeight = 5;
    public static int maxGeneralCost = 0;
    private List<Item> resultListItems = new ArrayList<>();
    private List<Item> bufListItems = new ArrayList<>();

    public static void main (String[] args) {

        //Задание №1
        System.out.println(Power.pow(2,5));

        //Задание №2
        Item[] arrItems = new Item[4];
        arrItems[0] = new Item("Часы",1,1000);
        arrItems[1] = new Item("Ноутбук",2,50000);
        arrItems[2] = new Item("Гиря",10,500);
        arrItems[3] = new Item("Утюг",1,2000);

        System.out.println("Вместимость рюкзака: " + maxKnapsackWeight);
        System.out.println("Список всех вещей:");
        for (int i = 0; i < arrItems.length; i++) {
            System.out.print(arrItems[i]);
        }
        System.out.println("Список вещей в рюкзаке:");
        System.out.println(new Main().findMaxCost(arrItems));
        System.out.println("Стоимость этих вещей: " + maxGeneralCost);

    }

    private int weight(List<Item> list) {
        int weight = 0;
        for (int i = 0; i < list.size(); i++) {
            weight = weight + list.get(i).getWeight();
        }
        return weight;
    }

    private int cost(List<Item> list) {
        int cost = 0;
        for (int i = 0; i < list.size(); i++) {
            cost = cost + list.get(i).getCost();
        }
        return cost;
    }

    private List<Item> findMaxCost (Item[] arr) {
        resultListItems.addAll(Arrays.asList(arr));
        if (weight(resultListItems) <= maxKnapsackWeight) {
            maxGeneralCost = cost(resultListItems);
            return resultListItems;
        }
        resultListItems.clear();
        bufListItems.addAll(Arrays.asList(arr));
        find(bufListItems);
        return resultListItems;
    }

    private void find(List<Item> bufList) {
        if (bufList.size() == 0) {
            return;
        }
        for (int i = 0; i < bufList.size(); i++) {
            List<Item> newBufList = new ArrayList<>(bufList);
            newBufList.remove(i);
            find(newBufList);

            int bufMaxCost = 0;
            int bufMaxWeight = 0;


            for (int j = 0; j < newBufList.size(); j++) {
                bufMaxCost = bufMaxCost + newBufList.get(j).getCost();
                bufMaxWeight = bufMaxWeight + newBufList.get(j).getWeight();
            }

            if (bufMaxCost > maxGeneralCost && bufMaxWeight <= maxKnapsackWeight) {
                maxGeneralCost = bufMaxCost;
                resultListItems.clear();
                resultListItems.addAll(newBufList);
            }

        }



    }
}
