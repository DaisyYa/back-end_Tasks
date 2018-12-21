package it.sevenbits;

import java.util.*;

/**
 * main class
 */
public class Main {
    /**
     * main method
     * @param args input args
     */
    public static void main(final String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "FIRST INSERTED");
        map.put("second", "SECOND INSERTED");
        map.put("third", "THIRD INSERTED");
        Set set = map.keySet();
        Collection collection = map.values();
        System.out.println("keys:" + set + " " + " values: " + collection);
        String[] strings = {"gggg kkk", "1111 ggg", "yyyy sss"};

        Map myMap = firstAndLastSymbol(strings);
        System.out.println(myMap);
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(6);
        list2.add(8);
        System.out.println(getUniqueValues(list1, list2));

    }

    /**
     * get Unique Values
     * @param list1 arrays of int
     * @param list2 arrays of int
     * @return ArrayList of unique values
     */
    private static ArrayList getUniqueValues(final List<Integer> list1, final List<Integer> list2) {
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(list1);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(list2);
        arrayList1.removeAll(list2);
        arrayList2.removeAll(list1);
        arrayList1.addAll(arrayList2);
        return arrayList1;
    }

    /**
     * first - key, last - value symbol
     * @param strings arrays of strings
     * @return HashMap first - key, last -value symbol
     */
    private static HashMap firstAndLastSymbol(final String[] strings) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for (String line : strings) {
            map.put(line.charAt(0), line.charAt(line.length() - 1));
        }
        return map;
    }
}
