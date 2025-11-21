package in.jts.training.sorting;

import java.sql.SQLOutput;

public class DoubleArray {
    private final double[] elements;
    private int size;

    public DoubleArray(int max) {
        elements = new double[max];
        size = 0;
    }

    public void insert(double value) {
        elements[size] = value;
        size++;
    }

    public void display() {
        System.out.print("Index : ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + i + "  ");
        }
        System.out.println();
        System.out.print("Values : ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + elements[i] + "   ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public double[] elements() {
        return elements;
    }
}
