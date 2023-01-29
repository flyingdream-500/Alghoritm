package search;

import search.base.AbstractSearch;

/**
 * Класс бинарного поиска в отсортированном массиве
 */
public class BinarySearch extends AbstractSearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.execute();
    }

    @Override
    public int search(int[] array, int value) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == value) {
                return middleIndex;
            }
            if (array[middleIndex] > value) {
                endIndex = middleIndex - 1;
            }
            if (array[middleIndex] < value) {
                startIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
