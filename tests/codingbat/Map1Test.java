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
    void rith_map_AB(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a","Hi");
        map1.put("b","There");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertEquals("HiThere", map2.get("ab"));
        Map<String, String> map3 = new HashMap<>();
        map3.put("b","meh");
        map3.put("b","meh");
        Map<String, String> map4 = Map1.mapAB(map3);
        assertFalse(map4.containsKey("ab"));
    }
}