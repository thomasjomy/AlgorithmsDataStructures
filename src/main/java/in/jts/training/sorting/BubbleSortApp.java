package in.jts.training.sorting;

public class BubbleSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DoubleArray doubleArray = new DoubleArray(maxSize);

        doubleArray.insert(77);
        doubleArray.insert(99);
        doubleArray.insert(22);
        doubleArray.insert(55);
        doubleArray.insert(11);
        doubleArray.insert(33);
        doubleArray.insert(66);

        doubleArray.display();
        BubbleSort.sort(doubleArray);
        doubleArray.display();
    }
}
