import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import ca.tru.sorting.SearchAndSort;

public class SearchAndSortTest {
    @Test
    public void selectionSortShouldWork() {
        Integer[] numbers = { 10, 5, 1, 9, 2, 4, 8, 7, 3, 6 };

        Integer[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        SearchAndSort.selectionSort(numbers);

        assertArrayEquals(sorted, numbers);

    }

    @Test
    public void insertionSortShouldWork() {
        Integer[] numbers = { 10, 5, 1, 9, 2, 4, 8, 7, 3, 6 };

        Integer[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        SearchAndSort.insertionSort(numbers);
        System.out.println("testing testing" + numbers);

        assertArrayEquals(sorted, numbers);
    }

    @Test
    public void bubbleSortShouldWork() {
        Integer[] numbers = { 10, 5, 1, 9, 2, 4, 8, 7, 3, 6 };

        Integer[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        SearchAndSort.bubbleSort(numbers);

        assertArrayEquals(sorted, numbers);

    }

    @Test
    public void quickSortShouldWork() {
        Integer[] numbers = { 10, 5, 1, 9, 2, 4, 8, 7, 3, 6 };

        Integer[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        SearchAndSort.quickSort(numbers);

        assertArrayEquals(sorted, numbers);

    }

    @Test
    public void mergeSortShouldWork() {
        Integer[] numbers = { 10, 5, 1, 9, 2, 4, 8, 7, 3, 6 };

        Integer[] sorted = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        SearchAndSort.mergeSort(numbers);

        assertArrayEquals(sorted, numbers);

    }
}
