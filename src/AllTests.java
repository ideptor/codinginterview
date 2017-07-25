

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import p1_2_reverse.TestReverse;
import p1_4_replace.TestReplace;
import p2_x_linkedlist.TestLinkedList;
import p3_x_stack_queue.TestQueue;
import p4_x_bst.traversal.TestTraversal;

@RunWith(Suite.class)
@SuiteClasses({ TestReverse.class, TestReplace.class, 
		TestLinkedList.class, TestTraversal.class,
		TestQueue.class})

public class AllTests {

}
