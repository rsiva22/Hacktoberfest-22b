package codegym;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
    void testToArrayParameterised() {
        LocalDate firstTime = LocalDate.of(1998,9,27);
        LocalDate secondTime = LocalDate.of(1999,12,15);
        LocalDate thirdTime = LocalDate.now();
        OurLinkedList<LocalDate> dates = new OurLinkedList<>();
        dates.add(firstTime);
        dates.add(secondTime);
        dates.add(thirdTime);

        LocalDate[] datesArray = dates.toArray(new LocalDate[0]);

        assertEquals(firstTime, datesArray[0]);
        assertEquals(secondTime, datesArray[1]);
        assertEquals(thirdTime, datesArray[2]);
    }
}
