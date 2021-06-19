package com.github.sndpchatterjee07;

/**
 * @author sandeep
 * @version 1.0
 *
 */
public class Welcome {

	/** The greeting message. */
	private String greetingMessage;

	/**
	 * Instantiates a new welcome.
	 *
	 * @param greetingMessage the greeting message
	 */
	public Welcome(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

	/**
	 * Sets the greeting message.
	 *
	 * @param greetingMessage the new greeting message
	 */
	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}

	/**
	 * Gets the greeting message.
	 *
	 * @return the greeting message
	 */
	public String getGreetingMessage() {
		return greetingMessage;
	}
}
