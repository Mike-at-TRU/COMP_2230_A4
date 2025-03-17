package ca.tru.sorting;

public class SearchAndSort {
    // how come we have to modify the original? speed? what if they need to old one
    // why have I gotten so many off by one errors?

    public static <T extends Comparable<T>> void selectionSort(T[] items) {
        for (int i = 0; i < items.length; i++) {
            int min = i;
            for (int k = i; k < items.length; k++) {
                if (leftLessThanRight(items[min], items[k])) {
                    min = k;
                }
            }
            swap(items, i, min);
        }
    }

    public static <T extends Comparable<T>> void insertionSort(T[] items) {
        for (int lengthOfSubarrary = 0; lengthOfSubarrary < items.length; lengthOfSubarrary++) {
            for (int whereToPut = lengthOfSubarrary; whereToPut > 0; whereToPut--) {
                if (leftLessThanRight(items[whereToPut - 1], items[whereToPut])) {
                    swap(items, whereToPut - 1, whereToPut);
                }
            }
        }

    }

    public static <T extends Comparable<T>> void bubbleSort(T[] items) {
        for (int i = 0; i < items.length - 1; i++) {
           
            for (int k = 0; k < items.length - (i); k++) {
                if(k-1 != -1 && leftLessThanRight(items[k-1], items[k])){
                    swap(items, k-1, k);
                }
            }
            
        }

    }

    public static <T extends Comparable<T>> void quickSort(T[] items) {

    }

    public static <T extends Comparable<T>> void mergeSort(T[] items) {

    }

    private static <T> void swap(T[] items, int i, int j) {
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    private static <T extends Comparable<T>> boolean leftLessThanRight(T left, T right) {
        return left.compareTo(right) > 0;
    }
}
