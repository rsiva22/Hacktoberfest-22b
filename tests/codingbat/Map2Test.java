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
    void andy_firstSwap() {
        // if no strings match
        String[] strings = {"cat", "dog", "bunny", "horse"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"cat", "dog", "bunny", "horse"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));

        // if strings match only swap first two that start with a given letter
        String[] strings2 = {"cat", "hog", "cow", "caterpillar", "hamster", "coon", "horse", "Human"};
        String[] result2 = Map2.firstSwap(strings2);
        String[] expected2 = {"cow", "hamster", "cat", "caterpillar", "hog", "coon", "horse", "Human"};
        assertEquals(Arrays.toString(expected2), Arrays.toString(result2));
    } // andy_firstSwap end
}