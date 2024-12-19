
    package com.pantxi.romain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class ArabicRomanNumeralsTest {


            @Test
            void testConvertSingleDigits() {
                assertEquals("I", ArabicRomanNumerals.convert(1));
                assertEquals("IV", ArabicRomanNumerals.convert(4));
                assertEquals("V", ArabicRomanNumerals.convert(5));
                assertEquals("IX", ArabicRomanNumerals.convert(9));
            }

            @Test
            void testConvertTens() {
                assertEquals("X", ArabicRomanNumerals.convert(10));
                assertEquals("XL", ArabicRomanNumerals.convert(40));
                assertEquals("L", ArabicRomanNumerals.convert(50));
                assertEquals("XC", ArabicRomanNumerals.convert(90));
            }

            @Test
            void testConvertHundreds() {
                assertEquals("C", ArabicRomanNumerals.convert(100));
                assertEquals("CD", ArabicRomanNumerals.convert(400));
                assertEquals("D", ArabicRomanNumerals.convert(500));
                assertEquals("CM", ArabicRomanNumerals.convert(900));
            }

            @Test
            void testConvertThousands() {
                assertEquals("M", ArabicRomanNumerals.convert(1000));
                assertEquals("MMM", ArabicRomanNumerals.convert(3000));
            }

            @Test
            void testConvertComplexNumbers() {
                assertEquals("MMXXIV", ArabicRomanNumerals.convert(2024));  // Année actuelle
                assertEquals("MMMCMXCIX", ArabicRomanNumerals.convert(3999)); // Plus grand nombre possible
                assertEquals("MCMLXXI", ArabicRomanNumerals.convert(1971));  // Test d'une année ancienne
            }
        }