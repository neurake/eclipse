package math;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void testAdd() {
		Addition obj=new Addition();
		assertEquals(10, obj.add(3, 7));
	}

}
