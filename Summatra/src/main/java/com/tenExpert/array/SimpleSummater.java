package com.tenExpert.array;

/**
 * class with sum method(simple sum)
 */
public class SimpleSummater implements IArraySummater {
    /**
     * simple addition numbers
     * @param array arra of integers
     * @return sum of numbers
     */
    public int sum(final int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }
}
