package lesson7;

import java.util.Objects;

public class Vertex {
    private final String label;
    private int countEdges;
    private int countVisits;

    public Vertex(String label) {
        this.label = label;
        this.countEdges = 0;
        this.countVisits = 0;
    }

    public String getLabel() {
        return label;
    }

    public int getCountEdges() {
        return countEdges;
    }

    public void addCountEdge() {
        this.countEdges++;
    }

    public int getCountVisits() {
        return countVisits;
    }

    public void addCountVisit() {
        this.countVisits++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vertex vertex = (Vertex) o;
        return Objects.equals(label, vertex.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return label;
    }
}
