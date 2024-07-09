package org.example.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class StreamsUebenTest {

    @Test
    public void geradeZahlenTest() {
        StreamsUeben streams = new StreamsUeben();
        List<Integer> input = IntStream.range(1, 11).boxed().toList();
        List<Integer> result = streams.geradeZahlen(input);
        assertEquals(5, result.size());
        assertTrue(result.containsAll(Arrays.asList(2, 4, 6, 8, 10)));
        // Achtung nur eine der beiden Assertions gibt nicht die volle Punktzahl
    }

    @Test
    public void geradeZahlenTestAndereOption() {
        StreamsUeben streams = new StreamsUeben();
        List<Integer> input = IntStream.range(1, 11).boxed().toList();
        List<Integer> result = streams.geradeZahlen(input);
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), result);
    }

    @Test
    public void durchDreiTeilbarTest() {
        StreamsUeben streams = new StreamsUeben();
        List<Integer> input = IntStream.range(1, 11).boxed().toList();
        List<Integer> result = streams.durchDreiTeilbar(input);
        assertEquals(3, result.size());
        assertTrue(result.containsAll(Arrays.asList(3, 6, 9)));
        // Achtung nur eine der beiden Assertions gibt nicht die volle Punktzahl
    }

    @Test
    public void durchDreiTeilbarTestAndereOption() {
        StreamsUeben streams = new StreamsUeben();
        List<Integer> input = IntStream.range(1, 11).boxed().toList();
        List<Integer> result = streams.durchDreiTeilbar(input);
        assertEquals(Arrays.asList(3, 6, 9), result);
    }

}