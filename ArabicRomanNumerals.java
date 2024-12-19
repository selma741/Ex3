package com.pantxi.romain;

public class ArabicRomanNumerals {
        public static String convert(int n) {
            // Tableaux des valeurs et des symboles romains
            int[] values = {10, 9, 4, 1};
            String[] symbols = {"X", "IX", "IV", "I"};

            StringBuilder roman = new StringBuilder();

            // Parcours des valeurs
            for (int i = 0; i < values.length; i++) {
                while (n >= values[i]) {
                    roman.append(symbols[i]);
                    n -= values[i];
                }
            }
            return roman.toString();
        }
    }