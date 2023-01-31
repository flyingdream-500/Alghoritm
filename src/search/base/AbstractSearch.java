package search.base;

import static utils.ArrayUtils.getRangeArray;
import static utils.CommonUtils.println;

public abstract class AbstractSearch implements Search {

    public void execute() {
        int[] array = getRangeArray(20);
        int targetValue = 5;
        int targetIndex = search(array, targetValue);
        println(String.valueOf(targetIndex));
    }
}
