package org.example.util;

public class InvertText {

    public String invert(String text) {
        char[] textChar = text.toCharArray();
        int start = 0, end = text.length() - 1;

        while (start < end) {
            //swap
            char temp = textChar[start];
            textChar[start] = textChar[end];
            textChar[end] = temp;

            start++;
            end--;
        }

        return new String(textChar);
    }
}
