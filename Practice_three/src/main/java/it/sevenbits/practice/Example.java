package it.sevenbits.practice;

import java.util.ArrayList;

public class Example {
    private ArrayList<Integer> arrayList = new ArrayList();

    public int getLongestLineCharsCount(FileReader fileReader) {
        while (fileReader.hasMoreLines()) {
            arrayList.add(fileReader.readLine().length());
        }
        int maxLength = arrayList.get(0);
        for(int length: arrayList){
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
