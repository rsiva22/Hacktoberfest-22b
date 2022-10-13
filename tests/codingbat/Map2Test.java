package codingbat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
    void april_wordCount(){
        String[] words = {"apple", "bee", "caramel", "dark", "bee", "elephant", "apple", "dark", "fog"};
        Map<String, Integer> result = Map2.wordCount(words);
        String[] expected = {"apple=2", "bee=2", "caramel=1", "dark=2", "elephant=1", "fog=1"};
        assertEquals(Arrays.toString(expected), result.toString().replaceAll("[{]", "[").replaceAll("[}]", "]"));
    }
}