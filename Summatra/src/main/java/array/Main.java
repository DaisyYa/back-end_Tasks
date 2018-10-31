package array;

/**
 * class with main method
 */
public class Main {
    /**
     *
     * @param arg array of strings
     */
    public static void main(final String[] arg) {
        int[] array1 = {2, 5, 4, 1, 1, 8, 2, 5};
        int[] array2 = {1, 1, 2};
        int[] array3 = {};
        PairSummater pairSummater = new PairSummater();
        SimpleSummater simpleSummater = new SimpleSummater();
        StringBuilder stringBuilder = new StringBuilder();

        try {
            stringBuilder.append("PairSummater: " + pairSummater.sum(array1) + ",\n");

        } catch (ArraySummaterException e) {
            e.printStackTrace();
        }
        try {
            stringBuilder.append(pairSummater.sum(array2) + ",\n");
        } catch (ArraySummaterException e) {
            e.printStackTrace();
        }
        try {
            stringBuilder.append(pairSummater.sum(array3) + ";\n\n");
        } catch (ArraySummaterException e) {
            e.printStackTrace();
        }

        stringBuilder.append("SimpleSummater: " + simpleSummater.sum(array1) + ",\n");
        stringBuilder.append(simpleSummater.sum(array2) + ",\n");
        stringBuilder.append(simpleSummater.sum(array3) + ";");
        System.out.println(stringBuilder);
    }
}
