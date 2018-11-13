package com.tenExpert.array;

import com.tenExpert.array.exception.ArraySummaterException;

/**
 * Interface with sum method
 */
public interface IArraySummater {
    /**
     * addition numbers
     * @param array arra of integers
     * @return  sum
     * @throws ArraySummaterException if arra length is not a multiple of two(for PairSummater)
     */
    int sum(int[] array) throws ArraySummaterException;
}
