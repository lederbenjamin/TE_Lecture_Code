package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class ExercisesTest {

	Exercises exercises = new Exercises();
	
	@Test
	public void theEnd() {
		assertEquals("Input: theEnd(\"Hello\", true)", "H", exercises.theEnd("Hello", true));
		assertEquals("Input: theEnd(\"Hello\", false)", "o", exercises.theEnd("Hello", false));
		assertEquals("Input: theEnd(\"oh\", true)", "o", exercises.theEnd("oh", true));
		assertEquals("Input: theEnd(\"oh\", false)", "h", exercises.theEnd("oh", false));
		assertEquals("Input: theEnd(\"x\", true)", "x", exercises.theEnd("x", true));
		assertEquals("Input: theEnd(\"x\", false)", "x", exercises.theEnd("x", false));
		assertEquals("Input: theEnd(\"java\", true)", "j", exercises.theEnd("java", true));
		assertEquals("Input: theEnd(\"chocolate\", false)", "e", exercises.theEnd("chocolate", false));
		assertEquals("Input: theEnd(\"1234\", true)", "1", exercises.theEnd("1234", true));
		assertEquals("Input: theEnd(\"code\", false)", "e", exercises.theEnd("code", false));
	}
	
	
	@Test
	public void hasBad() {
		assertEquals("Input: hasBad(\"badxx\")", true, exercises.hasBad("badxx"));
		assertEquals("Input: hasBad(\"xbadxx\")", true, exercises.hasBad("xbadxx"));
		assertEquals("Input: hasBad(\"xxbadxx\")", false, exercises.hasBad("xxbadxx"));
		assertEquals("Input: hasBad(\"code\")", false, exercises.hasBad("code"));
		assertEquals("Input: hasBad(\"bad\")", true, exercises.hasBad("bad"));
		assertEquals("Input: hasBad(\"ba\")", false, exercises.hasBad("ba"));
		assertEquals("Input: hasBad(\"xba\")", false, exercises.hasBad("xba"));
		assertEquals("Input: hasBad(\"xbad\")", true, exercises.hasBad("xbad"));
		assertEquals("Input: hasBad(\"\")", false, exercises.hasBad(""));
		assertEquals("Input: hasBad(\"badyy\")", true, exercises.hasBad("badyy"));
	}
	
	@Test
	public void sum28() {
		assertEquals("Input: sum28(new int[]{2, 3, 2, 2, 4, 2})", true, exercises.sum28(new int[]{2, 3, 2, 2, 4, 2}));
		assertEquals("Input: sum28(new int[]{2, 3, 2, 2, 4, 2, 2})", false, exercises.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
		assertEquals("Input: sum28(new int[]{1, 2, 3, 4})", false, exercises.sum28(new int[]{1, 2, 3, 4}));
	}
	
	@Test
	public void caughtSpeeding() {
		assertEquals("Input: caughtSpeeding(60, false)", 0, exercises.caughtSpeeding(60, false));
		assertEquals("Input: caughtSpeeding(65, false)", 1, exercises.caughtSpeeding(65, false));
		assertEquals("Input: caughtSpeeding(65, true)", 0, exercises.caughtSpeeding(65, true));
		assertEquals("Input: caughtSpeeding(50, false)", 0, exercises.caughtSpeeding(50, false));
		assertEquals("Input: caughtSpeeding(50, true)", 0, exercises.caughtSpeeding(50, true));
		assertEquals("Input: caughtSpeeding(66, true)", 1, exercises.caughtSpeeding(66, true));
		assertEquals("Input: caughtSpeeding(85, true)", 1, exercises.caughtSpeeding(85, true));
		assertEquals("Input: caughtSpeeding(85, false)", 2, exercises.caughtSpeeding(85, false));
	}
	
	@Test
	public void sumNumbers1To20() {
		assertEquals("Incorrect Sum", 210, exercises.sumNumbers1To20());
	}
}
