package p3_x_stack_queue;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestQueue {

	@Test
	public void test_queue_test() {
		
		// given
		Queue<Integer> q = new Queue<>();
		assertEquals(0, q.size());
		
		q.enqueue(0);
		assertEquals(1, q.size());
		
		q.enqueue(1);
		assertEquals(2, q.size());
		
		assertEquals(new Integer(0), q.dequeue());
		assertEquals(1, q.size());
		
		assertEquals(new Integer(1), q.dequeue());
		assertEquals(0, q.size());
		
		
	}

}
