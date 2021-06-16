package com.github.sndpchatterjee07;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.Ignore;

/**
 * Unit tests.
 */
public class WelcomeTest {

	/**
	 * Rigorous Test :-)
	 */
	@Ignore("Test is ignored as a demonstration")
	@Test
	public void testSame() {
		assertThat(1, is(1));
	}

	@Test
	public void getGreetingMessage_whenInitializedWithGreeting_returnsGreeting() {
		Welcome welcome = new Welcome("Hello World!");
		assertThat(welcome.getGreetingMessage(), is("Hello World!"));
	}
}
