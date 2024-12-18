package com.pantxi.romain;

public class ArabicRomanNumerals {
    public static String convert(int n) {
        StringBuilder roman = new StringBuilder();
        int[] values = {4, 1};
        String[] symbols = {"IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                roman.append(symbols[i]);
                n -= values[i];
            }
        }
        return roman.toString();
    }}