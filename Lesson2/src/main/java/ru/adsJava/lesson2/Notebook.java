package ru.adsJava.lesson2;

public class Notebook {
    private int cost;
    private int ram;
    private String manufacturer;
    private int manufacturerId;

    // Для массива цен ноутбуков
    private static int minCost = 500;
    private static int maxCost = 2000;
    private static int gapCost = 50;
    private static double quantityArrCost = Math.ceil((maxCost - minCost) / gapCost) + 1;
    private static int[] arrCost = new int[(int)quantityArrCost];

    // Для массива ОЗУ ноутбуков
    private static int minRam = 4;
    private static int maxRam = 24;
    private static int gapRam = 4;
    private static double quantityArrRam = Math.ceil((maxRam - minRam) / gapRam + 1);
    private static int[] arrRam = new int[(int)quantityArrRam];

    // Для массива производителей ноутбуков
    private static String[] arrManufacturer = {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};


    public Notebook() {
        this.cost = arrCost[randomInt(0,(int)quantityArrCost -1)];
        this.ram = arrRam[randomInt(0,(int)quantityArrRam -1)];
        this.manufacturer = arrManufacturer[randomInt(0,arrManufacturer.length-1)];
        if (this.manufacturer.equals("Lenuvo")) {
            this.manufacturerId = 1;
        }
        if (this.manufacturer.equals("Asos")) {
            this.manufacturerId = 2;
        }
        if (this.manufacturer.equals("MacNote")) {
            this.manufacturerId = 3;
        }
        if (this.manufacturer.equals("Eser")) {
            this.manufacturerId = 4;
        }
        if (this.manufacturer.equals("Xamiou")) {
            this.manufacturerId = 5;
        }
    }

    public static void createArrCost() {
        arrCost[0] = minCost;
        for (int i = 1; i < arrCost.length; i++) {
            arrCost[i] = arrCost[i-1] + gapCost;
        }
    }

    public static void createArrRam() {
        arrRam[0] = minRam;
        for (int i = 1; i < arrRam.length; i++) {
            arrRam[i] = arrRam[i-1] + gapRam;
        }
    }

    private static int randomInt(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public int getCost() {
        return cost;
    }

    public int getRam() {
        return ram;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "cost = " + cost +
                ", ram = " + ram +
                ", manufacturer = '" + manufacturer + '\'' +
                '}';
    }
    public static void swapArr(Notebook[] arrNotebook, int i, int j) {
        Notebook n = arrNotebook[i];
        arrNotebook[i] = arrNotebook[j];
        arrNotebook[j] = n;
    }

}
