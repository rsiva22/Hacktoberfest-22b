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
    void testOffer(){
        OurLinkedList<Integer> list = new OurLinkedList<>();
        boolean test1 = list.offer(4);
        boolean test2 = list.offer(3);
        boolean test3 = list.offer(100000);
        // Test returns
        assertTrue(test1);
        assertTrue(test2);
        // Test placements
        assertEquals(4,list.get(0));
        assertEquals(3,list.get(1));
        assertEquals(100000, list.get(2));

    }
}
