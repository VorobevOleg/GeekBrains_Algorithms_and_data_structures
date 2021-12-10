package ru.adsJava.lesson2;

public class Notebook {
    private int cost;
    private int ram;
    private String manufacturer;

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

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static int getMaxCost() {
        return maxCost;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public static int getMaxRam() {
        return maxRam;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "cost = " + cost +
                ", ram = " + ram +
                ", manufacturer = '" + manufacturer + '\'' +
                '}';
    }

                Collections.sort(allBooks, new Comparator<Book>() {

        @Override
        public int compare(Book t, Book t1) {
            int a =  t.getId()- t1.getId();

            if(a == 0){
                int a1 = t.getNumber() - t1.getNumber();
                return a1;
            }
            else
                return a;
        }
    });
}
