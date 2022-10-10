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
    void matthew_mapAB() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hello");
        map1.put("b", "Hi");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertTrue(map2.containsKey("ab"));
        assertTrue(map2.containsValue("HelloHi"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "Asdf");
        map3.put("b", "Asdf");
        Map<String, String> map4 = Map1.mapAB(map3);
        map4.put("ab", "AsdfAsdf");
        assertEquals(map4, map3);

    }

}
