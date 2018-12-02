package it.sevenbits.practice;

/**
 * class example with method getLongestLineCharsCount
 */
public class Example {
    /**
     * find maximum string length
     * @param fileReader class instance FileReader
     * @return maximum string length(int)
     */
    public int getLongestLineCharsCount(final FileReader fileReader) {
        int maxLength = 0;
        while (fileReader.hasMoreLines()) {
            int length = fileReader.readLine().length();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
