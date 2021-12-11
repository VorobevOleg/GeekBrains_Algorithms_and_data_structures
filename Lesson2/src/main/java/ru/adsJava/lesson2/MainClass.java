package ru.adsJava.lesson2;

public class MainClass {
    public static void main(String[] args) {

        Notebook[] arrNotebooks = new Notebook[10000];
        Notebook.createArrCost();
        Notebook.createArrRam();

        for (int i = 0; i < arrNotebooks.length; i++) {
            arrNotebooks[i] = new Notebook();
        }

        System.out.println("Ноутбуки до сортировки ----------------------");

        for (int i = 0; i < arrNotebooks.length; i++) {
            System.out.println(arrNotebooks[i]);
        }

        System.out.println("Ноутбуки после сортировки ----------------------");

        Sort.selectionSort(arrNotebooks);

        for (int i = 0; i < arrNotebooks.length; i++) {
            System.out.println(arrNotebooks[i]);
        }
    }
}
