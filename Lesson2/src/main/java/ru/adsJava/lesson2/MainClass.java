package ru.adsJava.lesson2;


import java.util.Arrays;
import java.util.Comparator;

public class MainClass {
    public static void main(String[] args) {

        Notebook[] arrNotebooks = new Notebook[100];
        Notebook.createArrCost();
        Notebook.createArrRam();

        for (int i = 0; i < arrNotebooks.length; i++) {
            arrNotebooks[i] = new Notebook();
        }

        System.out.println("Ноутбуки до сортировки ----------------------");

        for (int i = 0; i < arrNotebooks.length; i++) {
            System.out.println(arrNotebooks[i].getCost());
            System.out.println(arrNotebooks[i].getRam());
            System.out.println(arrNotebooks[i].getManufacturer());
        }
        System.out.println("Ноутбуки после сортировки ----------------------");


        Arrays.sort(arrNotebooks, Comparator.comparingInt(Notebook::getCost)
                        .thenComparingInt(Notebook::getRam)
                .thenComparing(Notebook::getManufacturer));


        for (int i = 0; i < arrNotebooks.length; i++) {
            System.out.println(arrNotebooks[i]);
        /*    System.out.println(arrNotebooks[i].getRam());
            System.out.println(arrNotebooks[i].getManufacturer()); */
        }


    }
}
