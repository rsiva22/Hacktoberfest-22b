package codegym;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

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
    void testGetFirst(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals("pizza", list.getFirst());

        OurLinkedList<String> list2 = new OurLinkedList<>();
        assertThrows(NoSuchElementException.class, () -> list2.getFirst());
    }

    @Test
    void marc_remove() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("Reese's");
        list.add("Skittles");
        list.add("Peanut Butter M&Ms");
        assertEquals("Reese's", list.remove());
        assertEquals("Skittles", list.remove());
        assertEquals("Peanut Butter M&Ms", list.get(0));
    }

    @Test
    void poll() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertEquals(list.poll(),"pizza");
    }

    @Test
    void testRemove() {
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        String remove1 = list.remove();

        assertEquals(remove1, "pizza");

    }
    @Test
    void testContains(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        assertTrue(list.contains("pizza"));
        assertTrue(list.contains("french fries"));
        assertTrue(list.contains("chicken wings"));
        assertFalse(list.contains("PIZZA"));
        assertFalse(list.contains("burger"));

    }

    @Test
    void andy_testPeekLast(){
        OurLinkedList<String> list = new OurLinkedList<>();
        list.add("pizza");
        list.add("chicken wings");
        list.add("french fries");
        OurLinkedList<Integer> list2 = new OurLinkedList<>();
        // test that the correct value is returned
        assertEquals("french fries", list.peekLast());
        // test that the last value was not removed from the list
        assertEquals("french fries", list.get(2));
        // test that null is returned if the list is empty
        assertNull(list2.peekLast());
    }

    @Test
    void testRemoveLast() {
        OurLinkedList<String> stringList = new OurLinkedList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");
        stringList.add("Fourth");
        stringList.add("Fifth");
        String lastString = stringList.removeLast();
        // Check that string extracted is indeed the last string in the array
        assertEquals("Fifth", lastString);
        // Check to see if calling the fifth location in a list returns an exception since it shouldn't exist.
        assertThrows(Exception.class, () -> { stringList.get(5); });
    }
}

