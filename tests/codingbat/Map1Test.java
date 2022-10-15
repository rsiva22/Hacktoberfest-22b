package codingbat;

import codingbat.Map1;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void marc_mapAB2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "cat");
        map1.put("b", "cat");
        Map<String, String> map2 = Map1.mapAB2(map1);
        assertFalse(map2.containsKey("a"));
        assertFalse(map2.containsKey("b"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "cat");
        map3.put("b", "dog");
        Map<String, String> map4 = Map1.mapAB2(map3);
        assertTrue(map4.containsKey("a"));
        assertTrue(map4.containsKey("b"));

    }


    @Test
    void stephen_mapAB3() {
        HashMap<String,String> firstMap = new HashMap<>();
        firstMap.put("a","Test Value");
        firstMap.put("d","I'm Cool");
        Map<String, String> testOneMap = Map1.mapAB3(firstMap);
        assertEquals("Test Value",testOneMap.get("a"));
        assertEquals("Test Value",testOneMap.get("b"));
        assertEquals("I'm Cool",testOneMap.get("d"));


        HashMap<String,String> secondMap = new HashMap<>();
        secondMap.put("a","Test Value");
        secondMap.put("b","Woot Woot");
        secondMap.put("c","You're Cool");
        Map<String, String> testTwoMap = Map1.mapAB3(secondMap);
        assertEquals("Test Value",testTwoMap.get("a"));
        assertEquals("Woot Woot",testTwoMap.get("b"));
        assertEquals("You're Cool",testTwoMap.get("c"));
    }

}