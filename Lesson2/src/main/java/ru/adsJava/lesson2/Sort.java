package ru.adsJava.lesson2;

public class Sort {

    public static void countingSortCost (Notebook[] theArray, int maxValue) {

        int numCounts[] = new int[maxValue + 1];

        for (int i = 0; i < theArray.length; i++) {
            numCounts[theArray[i].getCost()]++;
        }

        int currentSortedIndex = 0;

        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            for (int k = 0; k < count; k++) {
                theArray[currentSortedIndex].setCost(n);
                currentSortedIndex++;
            }
        }
    }

    public static void countingSortRam (Notebook[] theArray, int maxValue) {

        int numCounts[] = new int[maxValue + 1];

        for (int i = 0; i < theArray.length; i++) {
            numCounts[theArray[i].getRam()]++;
        }

        int currentSortedIndex = 0;

        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            for (int k = 0; k < count; k++) {
                theArray[currentSortedIndex].setRam(n);
                currentSortedIndex++;
            }
        }
    }

}
