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
    void john_firstSwap(){
        String[] str = {"goat","bat","john","bart","george", "kaitlyn","box"};
        String[] result = Map2.firstSwap(str);
        String[] expected = {"george","bart","john","bat","goat","kaitlyn","box"};
        assertEquals(Arrays.toString(expected),Arrays.toString(result));
        assertTrue(result[2].equals("john"));
        assertTrue(result[5].equals("kaitlyn"));
        assertTrue(result[6].equals("box"));

    }


}