package com.pantxi.romain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class ArabicRomanNumeralsTest {

    @Test
    public void testConvert1() {
        assertThat(ArabicRomanNumerals.convert(1)).isEqualTo("I");
    }
}