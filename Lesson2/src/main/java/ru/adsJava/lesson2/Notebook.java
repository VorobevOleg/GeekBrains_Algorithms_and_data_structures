package ru.adsJava.lesson2;

public class Notebook {
    private int cost;
    private int ram;
    private String manufacturer;

    private int max = 2000;


    public Notebook() {
        this.cost = (int) (Math.random() * ++max) + 500;;
        this.ram = randRam;
        this.manufacturer = randManufacturer;
    }


}
