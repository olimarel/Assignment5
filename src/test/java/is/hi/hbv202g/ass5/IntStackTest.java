package is.hi.hbv202g.ass5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class IntStackTest {
    IntStack stack;

    @Before
    public void constructStackTestObject() {
        stack = new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void testFullStackIsFull() {
        int N = stack.getCapacity();

        for (int i = 0; i < N; i++) {
            stack.push(i);
        }

        assertTrue(stack.isFull());
    }

    @Test
    public void testAlmostFullStack() {
        int N = stack.getCapacity();

        for (int i = 1; i <= N; i++) {
            stack.push(i);
        }

        stack.pop();

        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        stack.push(10);
        assertEquals(10, stack.pop());
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack() {
        stack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack() {
        int N = stack.getCapacity();

        for (int i = 1; i <= N; i++) {
            stack.push(i);
        }

        stack.push(11);

    }

    @Test
    public void testEmptyStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testAlmostEmptyStack() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }


}
