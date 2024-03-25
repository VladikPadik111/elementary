package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax11To28Then2() {
        int left = 11;
        int right = 28;
        int result = Max.max(left, right);
        int expected = 28;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax37To29Then2() {
        int left = 37;
        int right = 29;
        int result = Max.max(left, right);
        int expected = 37;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax104To7Then2() {
        int left = 104;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 104;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax19To19Then2() {
        int left = 19;
        int right = 19;
        int result = Max.max(left, right);
        int expected = 19;
        assertThat(result).isEqualTo(expected);
    }
}



