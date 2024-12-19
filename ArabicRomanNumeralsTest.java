
    package com.pantxi.romain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class ArabicRomanNumeralsTest {

        @Test
        void testConvert10() {
            assertEquals("X", ArabicRomanNumerals.convert(10));
        }
    }