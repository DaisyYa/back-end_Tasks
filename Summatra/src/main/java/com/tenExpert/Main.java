package com.tenExpert;


import com.tenExpert.array.PairSummater;
import com.tenExpert.array.SimpleSummater;
import com.tenExpert.array.exception.ArraySummaterException;

/**
 * class with com.tenExpert.main method
 */
public class Main {
    /**
     *  main class
     * @param arg arra of strings
     */
    public static void main(final String[] arg) {
        int[] array1 = {2, 5, 4, 1, 1, 8, 2, 5};
        int[] array2 = {1, 1, 2};
        int[] array3 = {};

        PairSummater pairSummater = new PairSummater();
        SimpleSummater simpleSummater = new SimpleSummater();
        StringBuilder stringBuilder = new StringBuilder();

        try {
            stringBuilder.append("PairSummater: array1 ").append(pairSummater.sum(array1)).append(",\n");

        } catch (ArraySummaterException e) {
            System.out.println("Error! Array length is not a multiple of two");
        }
        try {
            stringBuilder.append("array2 ").append(pairSummater.sum(array2)).append(",\n");
        } catch (ArraySummaterException e) {
            System.out.println("Error! Array length is not a multiple of two");
        }
        try {
            stringBuilder.append("array3 ").append(pairSummater.sum(array3)).append(";\n\n");
        } catch (ArraySummaterException e) {
            System.out.println("Error! Array length is not a multiple of two");
        }
        stringBuilder.append("\nSimpleSummater: array1 ").append(simpleSummater.sum(array1)).append(",\n");
        stringBuilder.append("array2 ").append(simpleSummater.sum(array2)).append(",\n");
        stringBuilder.append("array3 ").append(simpleSummater.sum(array3)).append(";");
        System.out.println(stringBuilder);
    }
}
