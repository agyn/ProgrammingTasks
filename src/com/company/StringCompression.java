package com.company;

public class StringCompression {

    public static String compress(String str) {

        int repetitionSize = getRepetitionSize(str);
        if(repetitionSize >= str.length()) return str;

        StringBuilder builder = new StringBuilder(repetitionSize);
        char current = str.charAt(0);
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {

            if (current != str.charAt(i)) {
                builder.append(current);
                builder.append(counter);
                current = str.charAt(i);
                counter = 1;
            } else {
                counter++;
            }

            if (i == str.length() - 1) {
                builder.append(current);
                builder.append(counter);
            }
        }
        return builder.toString();
    }

    private static int getRepetitionSize(String str) {
        char current = str.charAt(0);
        int counter = 2;
        for (int i = 0; i < str.length(); i++) {
            if (current != str.charAt(i)) {
                current = str.charAt(i);
                counter = counter + 2;
            }
        }

        return counter;
    }
}
