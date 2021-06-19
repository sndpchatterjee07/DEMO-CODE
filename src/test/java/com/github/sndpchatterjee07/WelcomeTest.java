package com.github.sndpchatterjee07;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.Ignore;

/**
 * Unit tests.
 */
public class WelcomeTest {

	Welcome welcome = new Welcome("Hello World!");

	/**
	 * Rigorous Test :-)
	 */
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testSame() {
		assertThat(1, is(1));
	}

	/**
	 * 
	 * To check if getGreetingMessage returns the same Greeting Message what was
	 * initialized.
	 *
	 */
	@Test
	public void getGreetingMessage_whenInitializedWithGreeting_returnsGreeting() {
		assertThat(welcome.getGreetingMessage(), is("Hello World!"));
	}

	/**
	 * To check the returned character count of getGreetingMessage
	 *
	 */
	@Test
	public void getGreetingMessage_characterCount() {
		assertEquals(12, welcome.getGreetingMessage().length());
	}

}
