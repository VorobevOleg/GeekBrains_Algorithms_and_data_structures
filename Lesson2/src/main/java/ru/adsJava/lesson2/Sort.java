package ru.adsJava.lesson2;

public class Sort {

    public static void selectionSort (Notebook[] theArray) {

        for (int i = 0; i < theArray.length -1; i++) {
            for (int j = i + 1; j < theArray.length; j++) {
                if (theArray[j].getCost() < theArray[i].getCost()) {
                    Notebook.swapArr(theArray, i, j);
                } else if (theArray[j].getCost() == theArray[i].getCost()) {
                    if (theArray[j].getRam() < theArray[i].getRam()) {
                        Notebook.swapArr(theArray, i, j);
                    } else if (theArray[j].getRam() == theArray[i].getRam()) {
                        if (theArray[j].getManufacturerId() < theArray[i].getManufacturerId()) {
                            Notebook.swapArr(theArray, i, j);
                        }
                    }
                }
            }
        }
    }


}
