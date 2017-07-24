package p1_4_replace;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReplace {

	@Test
	public void test() {
		assertEquals("Mr%20John%20Smith", Main.replace("Mr John Smith            ".toCharArray(), 13));
	}

}
