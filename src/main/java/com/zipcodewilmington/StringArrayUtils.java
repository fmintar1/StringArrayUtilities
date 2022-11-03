package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            s.contains(value);
            return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i = array.length-1; i >= 0; i--) {
            sb.append(array[i]).append(" ");
        }
        String[] result = sb.toString().split(" ");
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = 0;
        for (String b : array) {
            if(array[i] == array[(array.length-1)-i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String result = Arrays.toString(array).toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            if (!result.contains(String.valueOf(alphabet.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

//        //instance a String variable combine
//        String combine = "";
//
//        //create a loop for array[] parameter
//        for (int i = 0; i < array.length; i++) {
//
//            //store & combine the array into combine, lowercase it, remove empty space
//            combine+=array[i].toLowerCase().replaceAll(" ","");
//        }
//
//        //split combine into array[] actual by single letters
//        String[] actual = combine.split("");
//
//        //sort actual alphabetically
//        Arrays.sort(actual);
//
//        //create ArrayList<String> called master for array[] actual
//        ArrayList<String> master = new ArrayList<>(List.of(actual));
//
//        //create a loop for ArrayList<>
//        for (int i = 0; i < master.size()-1; i++) {
//
//            //if the next element of master array index is equal, remove element
//            while (master.get(i).equals(master.get(i+1))) {
//                master.remove(i);
//            }
//        }
//
//        //create ArrayList for alphabet using List.of(array[]) with split into single letters
//        ArrayList<String> alphabet = new ArrayList<>(List.of("abcdefghijklmnopqrstuvwxyz".split("")));
//
//        //if master equals to alphabet, return true
//        if (master.equals(alphabet)) {
//            return true;
//        }
//
//        //otherwise, false
//        return false;

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(value)) {
                result++;
            }
        }
        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> lists = new ArrayList<>(List.of(array));
        for (int i = 0; i < lists.size()-1; i++) {
            lists.remove(valueToRemove);
        }
        System.out.println(lists);
        String[] result = lists.toArray(new String[0]);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> lists = new ArrayList<>(List.of(array));
        for (int i = 0; i < lists.size()-1; i++) {
            if (lists.get(i).equals(lists.get(i+1))) {
                lists.remove(i+1);
                i--;
            }
        }
        String[] result = lists.toArray(new String[0]);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> lists = new ArrayList<>(List.of(array));
        for (int i = 0; i < lists.size()-1; i++) {
                while (lists.get(i).contains(lists.get(i + 1))) {
                    lists.set(i+1, lists.get(i) + lists.get(i + 1));
                    lists.remove(i);
                }
            System.out.println(lists);
        }

        System.out.println(lists);
        String[] result = lists.toArray(new String[0]);
        return result;
    }


}
