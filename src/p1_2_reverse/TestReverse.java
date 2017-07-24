package p1_2_reverse;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestReverse {

	@Test
	public void test() {
		assertEquals(Main.revserse("test".toCharArray()),"tset");
		assertEquals(Main.revserse("test1".toCharArray()),"1tset");
		
	}

}
