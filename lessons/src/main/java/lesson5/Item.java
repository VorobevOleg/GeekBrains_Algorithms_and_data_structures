package lesson5;

public class Item {

    private String name;
    private int weight;
    private int cost;

    public Item(String name, int weight, int cost) {
        this.name = name;
        this.weight = Math.abs(weight);
        this.cost = Math.abs(cost);
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Item: { " +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", cost = " + cost +
                '}' + '\n';
    }
}
