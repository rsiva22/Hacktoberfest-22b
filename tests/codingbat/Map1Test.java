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
    void teft_mapAB4() {
        Map<String, String> testmap = new HashMap<>();
        testmap.put("a", "longer");
        testmap.put("b", "short");
        Map<String, String> methodmap = Map1.mapAB4(testmap);
        assertTrue(testmap.containsKey("c"));
        assertTrue(testmap.get("c").equals("longer"));
        assertTrue(testmap.get("c").equals(testmap.get("a")));

        Map<String, String> testmap2 = new HashMap<>();
        testmap2.put("a", "short");
        testmap2.put("b", "longer");
        Map<String, String> methodmap2 = Map1.mapAB4(testmap2);
        assertTrue(testmap2.containsKey("c"));
        assertTrue(testmap2.get("c").equals("longer"));
        assertTrue(testmap2.get("c").equals(testmap2.get("b")));

        Map<String, String> testmap3 = new HashMap<>();
        testmap3.put("a", "same");
        testmap3.put("b", "same");
        Map<String, String> methodmap3 = Map1.mapAB4(testmap3);
        assertTrue(!testmap3.containsKey("c"));
        assertTrue(testmap3.get("a").equals(""));
        assertTrue(testmap3.get("b").equals(""));
    }

}