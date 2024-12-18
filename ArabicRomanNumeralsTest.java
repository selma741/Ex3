package com.pantxi.romain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicRomanNumeralsTest {

    @Test
    void testConvert4() {
        assertEquals("IV", ArabicRomanNumerals.convert(4));
    }
    
}