package codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class OurLinkedListTest {

    @Test
    void add() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals("pizza", list.get(0));
        assertEquals("chicken wings", list.get(1));
        assertEquals("french fries", list.get(2));
    }

    @Test
    void testAdd() {
    }


    @Test
    void testRemove() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        String remove1 = list.remove();
        // first head remove is null because add method never set value for first.
        assertNull(remove1);
        String remove2 = list.remove();
        // now we can expect the first node added to be return.
        assertEquals(remove2, "pizza");

    }

    @Test
    void indexOf() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("red");
        list.add("orange");
        list.add("yellow");

        int itemIndex1 = list.indexOf("red");
        int itemIndex2 = list.indexOf("purple");
        int itemIndex3 = list.indexOf("yellow");
        int itemIndex4 = list.indexOf("orange");

        assertEquals(0, itemIndex1);
        assertEquals(2, itemIndex3);
        assertEquals(-1, itemIndex2);
        assertEquals(1, itemIndex4);
    }
}
