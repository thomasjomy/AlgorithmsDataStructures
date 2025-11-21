package in.jts.training.sorting;

public class RecursiveQuicksort {

    public static void main(String[] args) {
        int[] array = {6, 3, 9, 5, 2, 8};
        printArray(array);
        sort(array);
        printArray(array);
    }

    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pivot = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, pivot - 1);
            quickSort(array, pivot + 1, highIndex);
        }
    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        int pivot = array[highIndex];
        System.out.println("pivot :" + highIndex + " pivot element : " + pivot);
        printArray(array);
        System.out.println();

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
            printArray(array);
        }

        swap(array, leftPointer, highIndex);
        printArray(array);

        return highIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] array) {
        System.out.print("elements :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}
