package search;

import search.base.AbstractSearch;

/**
 * Класс линейного поиска в массиве
 */
public class LinearSearch extends AbstractSearch {
    @Override
    public int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.execute();
    }
}
