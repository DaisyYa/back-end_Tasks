package array;

/**
 * Interface with sum method
 */
public interface IArraySummater {
    /**
     *
     * @param array array of integers
     * @return  sum
     * @throws ArraySummaterException if array length is not a multiple of two(for PairSummater)
     */
    int sum(int[] array) throws ArraySummaterException;
}
