package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Map2Test {

    @Test
    void marc_wordAppend() {
        String[] strings = {"cat", "dog", "mouse", "cat", "rabbit", "cat", "mouse", "cat", "mouse", "cat", "cat"};
        String result = Map2.wordAppend(strings);
        assertEquals("catmousecatcat", result);
    }

    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] result = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

}