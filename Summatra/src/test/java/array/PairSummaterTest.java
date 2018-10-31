package array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;

public class PairSummaterTest {
    private PairSummater pairSummater;

    @Before
    public void setUp(){
        this.pairSummater = new PairSummater();
    }
    @Test
    public void pairSummaterEvenArrayTest() {
        int[] evenArray = {2, 7, 5, 1};
        int maxSum = 9;
        int maxPairSum;
        try {
            maxPairSum = pairSummater.sum(evenArray);
            Assert.assertEquals(maxSum, maxPairSum);
        } catch (ArraySummaterException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void pairSummaterOddArrayTest() {
        int[] evenArray = {2, 7, 5};
        int maxPairSum;
        try {
            maxPairSum = pairSummater.sum(evenArray);
            fail();
        } catch (ArraySummaterException e) {
            Assert.assertNotEquals("", e.getMessage());
        }
    }
    @Test
    public void pairSummaterNullArrayTest() {
        int[] evenArray = {};
        int maxPairSum;
        try {
            maxPairSum = pairSummater.sum(evenArray);
            fail();
        } catch (ArraySummaterException e) {
            Assert.assertNotEquals("", e.getMessage());
        }
    }
    @Test
    public void pairSummaterOneNumberInArrayTest() {
        int[] evenArray = {5};
        int maxPairSum;
        try {
            maxPairSum = pairSummater.sum(evenArray);
            fail();
        } catch (ArraySummaterException e) {
            Assert.assertNotEquals("", e.getMessage());
        }
    }
    @Test
    public void pairSummaterArrayTest() {
        int[] evenArray = {-5, 4, -5, 4 };
        int maxPairSum;
        int maxSum = -1;
        try {
            maxPairSum = pairSummater.sum(evenArray);
            Assert.assertEquals(maxSum, maxPairSum);
        } catch (ArraySummaterException e) {
            e.printStackTrace();
        }
    }
}
