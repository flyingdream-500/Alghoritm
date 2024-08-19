package sort;

import sort.base.AbstractSort;

public class MergeSort extends AbstractSort {

    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int middle = (left + right) / 2;
        mergeSort(array, left, middle);
        mergeSort(array, middle + 1, right);
        merge(array, left, middle, right);
    }

    private void merge(int[] array, int left, int middle, int right) {
        int lengthLeft = middle - left + 1;
        int lengthRight = right - middle;

        int[] leftArray = new int[lengthLeft];
        int[] rightArray = new int[lengthRight];

        for (int i = 0; i < lengthLeft; i++) {
            leftArray[i] = array[left + i];
        }
        for (int i = 0; i < lengthRight; i++) {
            rightArray[i] = array[middle + i + 1];
        }

        int leftIndex = 0;
        int rightIndex = 0;

        // копируем из leftArray и rightArray обратно в массив
        for (int i = left; i < right + 1; i++) {
            // если остаются нескопированные элементы в R и L, копируем минимальный
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            // если все элементы были скопированы из rightArray, скопировать остальные из leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // если все элементы были скопированы из leftArray, скопировать остальные из rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void main(String[] args) {
        AbstractSort mergeSort = new MergeSort();
        mergeSort.execute();
    }
}
