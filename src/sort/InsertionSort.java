package sort;

import sort.base.AbstractSort;

/**
 * Сортировка вставками
 */
public class InsertionSort extends AbstractSort {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int previousIndex = i - 1;
            while (previousIndex >= 0 && current < array[previousIndex]) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }

            array[previousIndex + 1] = current;
        }
    }

    public static void main(String[] args) {
        AbstractSort insertionSort = new InsertionSort();
        insertionSort.execute();
    }

/*
    Output:
    [5, 7, 15, 11, 14, 8, 1, 16, 6, 17, 2, 9, 18, 12, 3, 4, 20, 19, 13, 10]
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
 */
}
