package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {
    
    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] result = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void matthew_word0() {
        String[] strings = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
        Map<String, Integer> result = Map2.word0(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 0);
        assertEquals(expected, result);

        String[] strings1 = {"2", "5", "1"};
        Map<String, Integer> result2 = Map2.word0(strings);
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("2", 0);
        expected2.put("5", 0);
        expected2.put("1", 0);
        assertTrue(expected2.containsKey("2"));
        assertTrue(expected2.containsKey("5"));
        assertTrue(expected2.containsKey("1"));
        assertTrue(expected2.containsValue(0));
    }
}