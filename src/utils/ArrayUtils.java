package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Утилитный класс для работы с массивами
 */
public final class ArrayUtils {

    /**
     * Метод для получения упорядоченного массива
     * @param size размер требуемого массива
     * @return упорядоченный массив
     */
    public static int[] getRangeArray(int size) {
        return IntStream.rangeClosed(1, size).toArray();
    }

    /**
     * Метод для получения смешанного числового массива
     * @param size - размер порядкового массива
     * @return смешанный массив
     */
    public static int[] getShuffledArray(int size) {
        List<Integer> list = IntStream.rangeClosed(1, size).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Метод для перемены двух значений по позициям в числовом массиве
     * @param array - числовой массив
     * @param firstIndex - первый индекс
     * @param secondIndex - второй индекс
     */
    public static void swapTwoItems(int[] array, int firstIndex, int secondIndex) {
        int tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }

    /**
     * Метод возвращает числовой массив в виде строки формата [1, .., n]
     * @param array - числовой массив
     * @return строка формата [1, .., n]
     */
    public static String getArrayString(int[] array) {
        return Arrays.toString(array);
    }

}
