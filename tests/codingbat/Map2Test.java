package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
    void marwa_fistSwap() {
      // firstSwap(["ab", "ac"]) → ["ac", "ab"]
        String[] strings = {"ab", "ac"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"ac", "ab"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
        assertTrue(Arrays.toString(expected).equals( Arrays.toString(result)));

    }
}