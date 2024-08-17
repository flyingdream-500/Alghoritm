package sort;

import sort.base.AbstractSort;

import static utils.ArrayUtils.swapTwoItems;

public class SelectionSort extends AbstractSort {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swapTwoItems(array, i, minIndex);
        }
    }

    public static void main(String[] args) {
        AbstractSort selectionSort = new SelectionSort();
        selectionSort.execute();
    }
}
