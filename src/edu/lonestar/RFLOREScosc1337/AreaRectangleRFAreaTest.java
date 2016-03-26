package edu.lonestar.RFLOREScosc1337;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaRectangleRFAreaTest {

	@Test
	public void testGetArea() {
		Rectangle rect = new Rectangle(5.0, 10.0);
		assertEquals (50.0, rect.getArea(), .000001);
	}

}
