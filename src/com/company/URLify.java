package com.company;

public class URLify {
    public static String urlify(String str, int length) {
        StringBuilder builder = new StringBuilder();
        char[] chars = str.substring(0, length).toCharArray();

        for (char c : chars) {
            if (c == ' ') {
                builder.append("%20");
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static String urlify2(String str, int length) {
        int spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }

        return str;
    }
}
