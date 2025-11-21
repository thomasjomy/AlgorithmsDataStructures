package in.jts.training.sorting;

public class BubbleSort {

    public static void sort(DoubleArray doubleArray) {
        System.out.println("Sorting array of size : " + doubleArray.size());
        //int outerIter, innerIter;
        //Outer iterator loops backwards
        //Inner iterator loops forward
        double[] elements = doubleArray.elements();
        for (int outerIter = doubleArray.size() - 1; outerIter > 1; outerIter--) {
            for (int innerIter = 0; innerIter < outerIter; innerIter++) {
                System.out.println("outerIter: " + outerIter + " innerIter: " + innerIter);
                if (elements[innerIter] > elements[innerIter + 1]) {
                    swap(elements, innerIter, innerIter + 1);
                }
            }
        }
    }

    private static void swap(double[] elements, int largerIndex, int smallerIndex) {
        System.out.println("Swapping largerIndex : " + largerIndex + " with smallerIndex: " + smallerIndex);
        double temp = elements[largerIndex];
        elements[largerIndex] = elements[smallerIndex];
        elements[smallerIndex] = temp;
    }
}
