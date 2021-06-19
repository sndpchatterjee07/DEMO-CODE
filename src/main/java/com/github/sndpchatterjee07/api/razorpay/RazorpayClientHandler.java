package com.github.sndpchatterjee07.api.razorpay;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

/**
 * The Class RazorpayClientHandler.
 * 
 * @author sandeep
 * @version 1.0
 * 
 */
public class RazorpayClientHandler {

	/** The SINGLETON class RazorpayClientHandler */
	private static final RazorpayClientHandler razorpayClientHandler = new RazorpayClientHandler();

	/**
	 * Instantiates a new RazorpayClientHandler.
	 */
	private RazorpayClientHandler() {
	}

	/**
	 * Gets the single instance of RazorpayClientHandler
	 *
	 * @return the single instance of RazorpayClientHandler
	 */
	public static RazorpayClientHandler getNewInstance() {
		return razorpayClientHandler;
	}

	/** The Constant RAZORPAY_PROPERTIES. */
	private static final String RAZORPAY_PROPERTIES = "razorpay.properties";

	/** The Constant PROPERTIES. */
	private static final Properties PROPERTIES = new Properties();

	/** The Constant KEY_ID. */
	private static final String KEY_ID = "key_id";

	/** The Constant KEY_SECRET. */
	private static final String KEY_SECRET = "key_secret";

	/** The RazorpayClient */
	private RazorpayClient razorpayClient = null;

	/**
	 * Creates the new RazorpayClient.
	 *
	 * @return the RazorpayClient
	 */
	public RazorpayClient createNewRazorPayClient() {

		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(RAZORPAY_PROPERTIES);

		try {

			PROPERTIES.load(inputStream);

			razorpayClient = new RazorpayClient(PROPERTIES.getProperty(KEY_ID), PROPERTIES.getProperty(KEY_SECRET));

		} catch (IOException ioException) {

			ioException.printStackTrace();

		} catch (RazorpayException razorpayException) {

			razorpayException.printStackTrace();
		}

		return razorpayClient;

	}

}
