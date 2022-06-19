package sort;

import static utils.ArrayUtils.*;
import static utils.CommonUtils.println;

/**
 * Сортировка пузырьком
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(int[] array) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swapTwoItems(array, i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sort bubbleSort = new BubbleSort();
        int[] shuffledArray = getShuffledArray(20);

        println(getArrayString(shuffledArray));

        bubbleSort.sort(shuffledArray);

        println(getArrayString(shuffledArray));
    }

/*
    Output:
    [14, 7, 1, 15, 4, 20, 12, 8, 13, 11, 5, 10, 19, 9, 3, 6, 18, 2, 17, 16]
    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
 */

}
