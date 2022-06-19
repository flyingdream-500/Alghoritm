package sort;

import sort.base.AbstractSort;

import static utils.ArrayUtils.*;

/**
 * Быстря сортировка
 */
public class QuickSort extends AbstractSort {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);

        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private int partition(int[] array, int begin, int end) {
        final int pivot = end;
        int counter = begin;

        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                swapTwoItems(array, i, counter);
                counter++;
            }
        }

        swapTwoItems(array, pivot, counter);

        return counter;
    }

    public static void main(String[] args) {
        AbstractSort quickSort = new QuickSort();
        quickSort.execute();
    }

/*
    Output:
    [17, 14, 20, 9, 13, 15, 2, 11, 12, 1, 8, 10, 7, 3, 18, 6, 4, 19, 16, 5]
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
 */
}
