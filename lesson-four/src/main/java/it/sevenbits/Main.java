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
        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(2);
        list3.add(8);
        list3.add(4);
        list3.add(3);
        List<Integer> list4 = new ArrayList<Integer>();
        list4.add(9);
        list4.add(4);
        list4.add(3);
        list4.add(1);
        List<Integer> list5 = new ArrayList<Integer>();
        list5.add(8);
        list5.add(10);
        list5.add(5);
        list5.add(7);

        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        System.out.println(getUniqueValues(lists, list5));

    }

    /**
     * get Unique Values
     * @param list1 arrays of arrays
     * @param list2 arrays of int
     * @return ArrayList of unique values
     */
    private static ArrayList getUniqueValues(final List<List<Integer>> list1, final List<Integer> list2) {
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(list2);
        ArrayList<ArrayList<Integer>> list1Copy = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < list1.size(); i++) {
            ArrayList<Integer> listCopy = new ArrayList<Integer>(list1.get(i));
            listCopy.removeAll(arrayList2);
            if(listCopy.size() == list1.get(i).size()) {
                list1Copy.add(listCopy);
            }
        }
        return list1Copy;
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
