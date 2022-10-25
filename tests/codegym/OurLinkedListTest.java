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
    void testOfferFirst() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("Java");
        list.add("Python");
        list.offerFirst("C#");
        assertTrue(list.get(0).equals("C#"));
        assertTrue(list.get(1).equals("Java"));
        assertTrue(list.get(2).equals("Python"));
    }
}
