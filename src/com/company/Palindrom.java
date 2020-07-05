package com.company;

public class Palindrom {
    public static boolean IsPermitationPalindrom(String str) {
        int[] table = buildCharFreequencyTable(str);
        return IsOneMaxOdd(table);
    }

    private static boolean IsOneMaxOdd(int[] table){
        boolean foundOdd = false;
        for(int count: table){
            if(count % 2 == 1){
                if(foundOdd){
                    return false;
                }
                foundOdd = true;
            }
        }

        return true;
    }

    private static int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }

        return -1;
    }

    private static int[] buildCharFreequencyTable(String str) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')];
        for (char c : str.toCharArray()) {
            int x = getCharNumber(c);

            if (x != -1) {
                table[x]++;
            }
        }

        return table;
    }
}
