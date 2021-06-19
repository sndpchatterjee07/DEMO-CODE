package com.github.sndpchatterjee07.api.razorpay;

import com.razorpay.Customer;
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

	public static void main(String[] args) {

		RazorpayClientHandler razorpayClientHandler = RazorpayClientHandler.getNewInstance();

		RazorpayClient razorpayClient = razorpayClientHandler.createNewRazorPayClient();

		/*
		 * CREATE A CUSTOMER
		 * 
		 */
		// JSONObject request = new JSONObject();
		// request.put("name", "Sandeep Chatterjee");
		// request.put("email", "sndpchatterjee@gmail.com");
		// Customer customer = razorpayClient.Customers.create(request);

		try {

			// FETCH CUSTOMER BY ID.
			Customer customer = razorpayClient.Customers.fetch("cust_HP2AmXM7SoqWZI");

			System.out.println(customer.toJson().get("name"));

			System.out.println(customer.toJson().get("email"));

		} catch (RazorpayException razorpayException) {

			razorpayException.printStackTrace();
		}

	}

}
