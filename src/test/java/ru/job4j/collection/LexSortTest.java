package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LexSortTest {
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.10",
                "1. Task.",
                "7. Task.",
                "5. Task.",
                "2. Task.",
                "6. Task.",
                "4. Task.",
                "12. Task.",
                "11. Task.",
                "7. Task."
        };
        String[] out = {
                "1. Task.",
                "2. Task.",
                "4. Task.",
                "5. Task.",
                "6. Task.",
                "7. Task.",
                "7. Task.",
                "10. Task.10",
                "11. Task.",
                "12. Task.",
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(out));
    }
}