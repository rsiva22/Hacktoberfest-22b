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