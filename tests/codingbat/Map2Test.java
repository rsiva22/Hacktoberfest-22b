package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static codingbat.Map1.mapBully;
import static codingbat.Map2.wordCount;
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
    void gideon_wordCount() {
        Map<String, Integer> map = new HashMap<>();
        String[] strings = {"a", "b", "a", "c", "b"};
        map=wordCount(strings);
        assertTrue(map.containsKey("a"));
        assertTrue(map.containsKey("b"));
        assertTrue(map.containsKey("c"));
        assertEquals(2,map.get("a"));
        assertEquals(2,map.get("b"));
        assertEquals(1,map.get("c"));
        assertFalse(2,map.get("c"));
    }

}