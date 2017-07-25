package p3_x_stack_queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStack {

	@Test
	public void testStack() {
		//given
		int[] elem = {6,7,4,5,1,2,3};
		
		//when
		Stack<Integer> stack = new Stack<>();
		for(int e:elem) {
			stack.push(e);
		}
		
		// then
		assertEquals(false, stack.empty());
		assertEquals(new Integer(3), stack.peek());
		assertEquals(new Integer(3), stack.pop());
		assertEquals(new Integer(2), stack.pop());
		assertEquals(new Integer(1), stack.pop());
		assertEquals(new Integer(5), stack.pop());
		assertEquals(new Integer(4), stack.pop());
		assertEquals(new Integer(7), stack.pop());
		assertEquals(new Integer(6), stack.pop());
		assertNull(stack.pop());
		assertEquals(true, stack.empty());
	}
	
	
	
	

}
