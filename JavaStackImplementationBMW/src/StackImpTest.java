import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for implementing stack data structure of any type
 *
 * @author Raphasha Donald Mailula
 * @version 1.0
 * JUnit5 Implementation
 */
class StackImpTest {
    /**
     * Testing Adding element on the top of the stack
     *
     */
    @Test
    void push() {
        StackImp stackImp = new StackImp();
        stackImp.push(42);
        assertEquals(42, stackImp.stackElements.get(stackImp.count()-1));
    }

    /**
     * Testing removing element on the top of the stack, last in last out
     * passing 99 to push() method lastly and expected it to be first item out
     * when calling the pop() method
     */
    @Test
    void pop() {
        StackImp stackImp = new StackImp();
        stackImp.push(42);
        stackImp.push(66);
        stackImp.push(99);
        Assertions.assertAll(
                () -> assertEquals(99, stackImp.pop()),
                () -> assertEquals(66, stackImp.pop()),
                () -> assertEquals(42, stackImp.pop())
        );
    }

    /**
     * Testing if the IsEmpty() methods works as expected
     * Add nothing to the list and should still be empty
     */
    @Test
    void isEmpty() {
        StackImp stackImp = new StackImp();
        assertTrue(stackImp.isEmpty());
    }

    /**
     * Testing if the IsEmpty() methods works as expected
     * Add 1 item to the list and should not be empty
     */
    @Test
    void isNotEmpty() {
        StackImp stackImp = new StackImp();
        stackImp.push(42);
        assertFalse(stackImp.isEmpty());
    }

    /**
     * Testing number of values on the stack
     * Add 1 item to the list and should be equals to 1
     */
    @Test
    void count() {
        StackImp stackImp = new StackImp();
        stackImp.push(42);
        assertEquals(1, stackImp.count());
    }

    /**
     * Testing where the element is on the stack index
     * Add 42 item to the list and should be equals to 0
     * when getting the index of 42
     */
    @Test
    public void testElementOnStackIndex() {
        StackImp stackImp = new StackImp();
        stackImp.push(42);
        int indexOf = stackImp.stackElements.indexOf(42);
        assertEquals(0, indexOf);
    }

    /**
     * Testing where the element is on the stack index
     * Add 42 item to the list and should be equals to 0
     * when getting the index of 42
     */
    @Test
    public void testCopyingStackValuesToAnotherAnnalistThenStacksAreEqual() {
        StackImp stackImp = new StackImp();
        stackImp.push(42);
        stackImp.push(66);
        stackImp.push(99);
        ListIterator<Object> iterator = stackImp.stackElements.listIterator();
        StackImp result = new StackImp();
        while(iterator.hasNext()) {
            result.push(iterator.next());
        }
        assertEquals(result.stackElements, stackImp.stackElements);
    }

    /**
     * Testing if the functionality for checking if the array is out of
     * bound index works as expected
     * Add 42 item to the list and remove the items twice and a
     * ArrayIndexOutOfBoundsException should be thrown
     */
    @Test
    void testArrayIndexOutOfBoundsException() {
        StackImp stackImp = new StackImp();
        stackImp.push(42);
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            assertEquals(stackImp.stackElements.get(stackImp.count()-1), stackImp.pop());
            assertEquals(stackImp.stackElements.get(stackImp.count()-1), stackImp.pop());
        });
    }
}