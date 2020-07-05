package com.company;

import java.util.Arrays;

public class StringPermutation {

    /*
    method 1
     */
    public static boolean checkMethodOne(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        return sort(str1).equals(str2);
    }

    public static String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }

    /*
    method 2
     */
    public static boolean checkMethodTwo(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] letters = new int[128];

        char[] char_array = str1.toCharArray();
        for (char c : char_array) {
            letters[c]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int c = str2.charAt(i);
            letters[c]--;
            if(letters.length < 0){
                return false;
            }
        }
        return true;
    }
}
