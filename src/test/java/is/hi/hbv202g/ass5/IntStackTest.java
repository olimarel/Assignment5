package is.hi.hbv202g.ass5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;


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

}
