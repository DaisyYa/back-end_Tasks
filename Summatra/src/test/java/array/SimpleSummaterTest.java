package array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleSummaterTest {
    private SimpleSummater simpleSummater;

    @Before
    public void setUp(){
        this.simpleSummater = new SimpleSummater();
    }
    @Test
    public void simpleSummaterEvenArrayTest() {
        int[] evenArray = {2, 7, 5, 1};
        int maxSum = 15;
        int maxSimpleSum = simpleSummater.sum(evenArray);
        Assert.assertEquals(maxSum, maxSimpleSum);
    }
    @Test
    public void simpleSummaterOddArrayTest() {
        int[] evenArray = {2, 7, 5};
        int maxSum = 14;
        int maxSimpleSum = simpleSummater.sum(evenArray);
        Assert.assertEquals(maxSum, maxSimpleSum);
    }
    @Test
    public void simpleSummaterNullArrayTest() {
        int[] evenArray = {};
        int maxSum = 0;
        int maxSimpleSum = simpleSummater.sum(evenArray);
        Assert.assertEquals(maxSum, maxSimpleSum);
    }
    @Test
    public void simpleSummaterOneNumberInArrayTest() {
        int[] evenArray = {5};
        int maxSum = 5;
        int maxSimpleSum = simpleSummater.sum(evenArray);
        Assert.assertEquals(maxSum, maxSimpleSum);
    }
    @Test
    public void simpleSummaterArrayTest() {
        int[] evenArray = {-5, 4, -5, 4 };
        int maxSum = -2;
        int maxSimpleSum = simpleSummater.sum(evenArray);
        Assert.assertEquals(maxSum, maxSimpleSum);
    }
}
