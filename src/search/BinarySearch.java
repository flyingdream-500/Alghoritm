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
    public int search(int[] array, int targetValue) {
        return iterativeBinarySearch(array, targetValue);
        //return recursiveBinarySearch(array, -2, 0, array.length - 1);
    }

    /**
     * Итеративный метод бинарного поиска
     *
     * @param array       отсотрированный массив
     * @param targetValue значение, которое необходимо найти
     * @return индекс требуемого значения
     */
    private int iterativeBinarySearch(int[] array, int targetValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == targetValue) {
                return middleIndex;
            }
            if (array[middleIndex] > targetValue) {
                endIndex = middleIndex - 1;
            }
            if (array[middleIndex] < targetValue) {
                startIndex = middleIndex + 1;
            }
        }

        return -1;
    }

    /**
     * Рекурсивный метод бинарного поиска
     *
     * @param array       отсотрированный массив
     * @param targetValue значение, которое необходимо найти
     * @param startIndex  стартовый индекс
     * @param endIndex    конечный индекс
     * @return индекс требуемого значения
     */
    private int recursiveBinarySearch(int[] array, int targetValue, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return -1;
        }

        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        if (array[middleIndex] == targetValue) {
            return middleIndex;
        }
        if (array[middleIndex] > targetValue) {
            return recursiveBinarySearch(array, targetValue, startIndex, middleIndex - 1);
        } else {
            return recursiveBinarySearch(array, targetValue, middleIndex + 1, endIndex);
        }
    }
}
