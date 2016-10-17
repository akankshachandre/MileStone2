package tutorial;

import org.junit.Assert;
import org.junit.Test;

import tutorial.Stack;


public class StackTest {

    @Test
    public void test() {
	Stack<Object> stack = new Stack<Object>();
	stack.push(new Object());
	Assert.assertFalse(stack.isEmpty());
    }
}