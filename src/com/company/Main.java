package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //System.out.println(UniqueCharsCheck.IsUniqueCharacter("zabs"));

        //System.out.println(StringPermitation.checkMethodOne("qqqw", "qqfw"));
//        System.out.println(StringPermutation.checkMethodTwo("qqqw", "qqfw"));
//          System.out.println(URLify.urlify("Mr John Smith   ",13));
//          System.out.println(Palindrom.IsPermitationPalindrom("Tact Coa"));
//          System.out.println(OneAway.isOneAway("pale","ple"));
//          System.out.println(OneAway.isOneAway("pales,","pale"));
//          System.out.println(OneAway.isOneAway("pale","bale"));
//          System.out.println(OneAway.isOneAway("pale","bae"));
//          System.out.println(StringCompression.compress("aabcccccaaa"));
//        int[][] arr = new int[][]{
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
//        ImageRotation.rotate(arr);
//
//        for (int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[0].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int[][] arr = new int[][]{
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };
//
//        System.out.println(arr.length);

        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        MaxtrixSetZeros.setZeros(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
