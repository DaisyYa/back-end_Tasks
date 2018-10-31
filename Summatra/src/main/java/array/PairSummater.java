package array;
import java.util.ArrayList;

/**
 * class with sum method(pair sum)
 */
public class PairSummater implements IArraySummater {

    /**
     *
     * @param array array of numbers
     * @return maximum sum pair
     * @throws ArraySummaterException if array length is not a multiple of two
     */
    public int sum(final int[] array) throws ArraySummaterException {
        if (array.length % 2 == 0 && array.length != 0) {
            ArrayList<Integer> arraySum = new ArrayList<Integer>();
            for (int i = 0; i < array.length - 1; i += 2) {
                arraySum.add(array[i] + array[i + 1]);
            }
            int maxSum = arraySum.get(0);
            for (int sum:arraySum) {
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
            return maxSum;

        } else {
            throw new ArraySummaterException("Error! Array length is not a multiple of two");
        }
    }
}
