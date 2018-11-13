package com.tenExpert.array;

import com.tenExpert.array.exception.ArraySummaterException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PairSummaterTest {
    private PairSummater pairSummater;

    @Before
    public void setUp(){
        this.pairSummater = new PairSummater();
    }

    @Test
    public void pairSummaterEvenArrayTest() throws ArraySummaterException {
        int[] evenArray = {2, 7, 5, 1};
        Assert.assertEquals(9, pairSummater.sum(evenArray));
    }

    @Test(expected = ArraySummaterException.class)
    public void pairSummaterOddArrayTest() throws ArraySummaterException {
        int[] evenArray = {2, 7, 5};
        pairSummater.sum(evenArray);
    }
    @Test(expected = ArraySummaterException.class)
    public void pairSummaterNullArrayTest() throws ArraySummaterException {
        int[] evenArray = {};
        pairSummater.sum(evenArray);
    }
    @Test
    public void pairSummaterArrayTest() throws ArraySummaterException {
        int[] evenArray = {-5, 4, -5, 4 };
        int maxPairSum;
        int maxSum = -1;
        maxPairSum = pairSummater.sum(evenArray);
        Assert.assertEquals(maxSum, maxPairSum);
    }
}
