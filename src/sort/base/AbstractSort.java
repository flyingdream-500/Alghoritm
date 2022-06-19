package sort.base;

import static utils.ArrayUtils.getArrayString;
import static utils.ArrayUtils.getShuffledArray;
import static utils.CommonUtils.println;

/**
 * Абстрактный класс для разных видов сортировок с единым методом выполнения
 */
public abstract class AbstractSort implements Sort {

    /**
     * Метод выполнения сортировки и отображения результата
     */
    public void execute() {
        int[] shuffledArray = getShuffledArray(20);

        println(getArrayString(shuffledArray));

        sort(shuffledArray);

        println(getArrayString(shuffledArray));
    }
}
