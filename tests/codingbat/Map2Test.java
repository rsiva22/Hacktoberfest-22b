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
    void nathan_wordLen(){
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "Cat", "cat"};
        Map<String, Integer> map1 = new HashMap<>();
        map1 = Map2.wordLen(strings);
        assertEquals(3, map1.get("cat"));
        assertEquals(3, map1.get("dog"));
        assertEquals(5, map1.get("bunny"));
        assertEquals(11, map1.get("caterpillar"));
        assertEquals(8, map1.get("kangaroo"));
        assertEquals(3, map1.get("Cat"));
    }

}