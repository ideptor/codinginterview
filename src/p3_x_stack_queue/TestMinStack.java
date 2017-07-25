package p3_x_stack_queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMinStack {

	@Test

	public void test() {
		//given
		int[] elem = {6,7,4,5,1,2,3};
		
		//when
		MinStack<Integer> stack = new MinStack<>();
		for(int e:elem) {
			stack.push(e);
		}
		
		assertEquals(new Integer(1), stack.min());
		
		assertEquals(new Integer(3), stack.pop());
		assertEquals(new Integer(1), stack.min());
		
		assertEquals(new Integer(2), stack.pop());
		assertEquals(new Integer(1), stack.min());
		
		assertEquals(new Integer(1), stack.pop());
		assertEquals(new Integer(4), stack.min());
		
		assertEquals(new Integer(5), stack.pop());
		assertEquals(new Integer(4), stack.min());
		
		assertEquals(new Integer(4), stack.pop());
		assertEquals(new Integer(6), stack.min());
		
		assertEquals(new Integer(7), stack.pop());
		assertEquals(new Integer(6), stack.min());
		
		assertEquals(new Integer(6), stack.pop());
		assertNull(stack.min());
	}

}
