package in.jts.training.sorting;

public class SelectionSort {

    public static void sort(DoubleArray doubleArray) {
        System.out.println("Sorting array of size : "+ doubleArray.size());
        //int outerIter, innerIter;
        //Outer iterator loops backwards
        //Inner iterator loops forward
        double[] elements = doubleArray.elements();

        for (int outerIter = 0; outerIter <  doubleArray.size() - 1; outerIter++) {
            int min = outerIter;

            for (int innerIter = outerIter + 1; innerIter < doubleArray.size(); innerIter++) {
                System.out.println("outerIter: " + outerIter +" innerIter: " + innerIter);
                if (elements[innerIter] < elements[min]) {
                    min = innerIter;
                }
            }

            swap(elements, outerIter, min);
        }
    }

    private static void swap(double[] elements, int largerIndex, int smallerIndex) {
        System.out.println("Swapping larger value [ " + elements[largerIndex] + " at index " + largerIndex + "] with smaller value [ " + elements[smallerIndex] +" at index " + smallerIndex + "]");
        double temp = elements[largerIndex];
        elements[largerIndex] = elements[smallerIndex];
        elements[smallerIndex] = temp;
    }
}
