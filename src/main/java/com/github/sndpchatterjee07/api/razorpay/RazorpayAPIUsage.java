package com.github.sndpchatterjee07.api.razorpay;

import org.json.JSONObject;

import com.github.sndpchatterjee07.api.razorpay.core.entities.MyCustomer;
import com.github.sndpchatterjee07.api.razorpay.core.handlers.RazorpayClientHandler;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

/**
 * The Class RazorpayAPIUsage.
 * 
 * @author sandeep
 * @version 1.0
 * 
 * @see https://github.com/razorpay
 * @see https://razorpay.com/docs/payment-gateway/server-integration/java/usage/
 * @see https://dashboard.razorpay.com
 */
public class RazorpayAPIUsage {

	/** The Business Entity MyCustomer. */
	private static MyCustomer myCustomer;

	/** The JSONObject. */
	private static JSONObject jsonObject;

	public static void main(String[] args) {

		RazorpayClientHandler razorpayClientHandler = RazorpayClientHandler.getNewInstance();

		RazorpayClient razorpayClient = razorpayClientHandler.createNewRazorPayClient();

		// 1. CREATING A RAZORPAY CUSTOMER.

		myCustomer = new MyCustomer.Builder("Faye J. Hill", "+442546949976", "FayeJHill@teleworm.uk").build();

		jsonObject = new JSONObject();

		jsonObject.put("name", myCustomer.getName());

		jsonObject.put("contact", myCustomer.getContact());

		jsonObject.put("email", myCustomer.getEmail());

		try {

			razorpayClient.Customers.create(jsonObject);

			System.out.println("NEW CUSTOMER CREATED!");

		} catch (RazorpayException razorpayException) {

			razorpayException.printStackTrace();
		}

	}

}