package search.base;

public interface Search {

    /**
     * Метод поиска индекса в массиве
     *
     * @param array массив поиска
     * @param value поисковое значение
     * @return индекс поискового значения
     */
    int search(int[] array, int value);
}
