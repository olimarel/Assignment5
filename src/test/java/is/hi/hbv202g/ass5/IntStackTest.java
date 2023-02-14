package is.hi.hbv202g.ass5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


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
    public void testFullStackIsAlmostFull() {
        int N = stack.getCapacity();

        for (int i = 0; i < N; i++) {
            stack.push(i);
        }

        stack.pop();

        assertFalse(stack.isFull());
    }

}
