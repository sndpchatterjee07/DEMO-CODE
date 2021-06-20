package com.github.sndpchatterjee07.api.razorpay.core.entities;

import java.util.HashMap;
import java.util.StringJoiner;

/**
 * The class MyCustomer corresponding to Razorpay entity Customer.
 * 
 * @author sandeep
 * @version 1.0
 * 
 * @see https://razorpay.com/docs/api/customers/#customer-entity
 * 
 */
public class MyCustomer {

	/** Unique identifier of the customer. For example, cust_1Aa00000000004 */
	private final int id;

	/**
	 * Customer's name. Alphanumeric, with period (.), apostrophe (') and
	 * parentheses allowed. Name must be between 3-50 characters in length. For
	 * example, Gaurav Kumar
	 */
	private final String name;

	/**
	 * The customer's phone number. Maximum length of 15 characters, inclusive of
	 * country code. For example, +919876543210
	 */
	private final String contact;

	/**
	 * The customer's email address. Maximum length of 64 characters. For example,
	 * gaurav.kumar@example.com
	 */
	private final String email;

	/** GST number linked to the customer. For example, 29XAbbA4369J1PA */
	private final String gstin;

	/**
	 * This is a key-value pair that can be used to store additional information
	 * about the entity. It can hold a maximum of 15 key-value pairs, 256 characters
	 * (maximum) each. For example, "note_key": "Beam me up Scotty”
	 */
	private final HashMap<String, String> notes;

	/**
	 * Timestamp, in Unix, when the customer was created. For example, 1234567890
	 */
	private final long created_at;

	/**
	 * Instantiates a new MyCustomer using a Builder Pattern.
	 *
	 * @param the customer builder Builder
	 */
	private MyCustomer(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.contact = builder.contact;
		this.email = builder.email;
		this.gstin = builder.gstin;
		this.notes = builder.notes;
		this.created_at = builder.created_at;
	}

	/**
	 * The Class Builder.
	 * 
	 * @see https://blogs.oracle.com/javamagazine/java-builder-pattern-bloch
	 * 
	 */
	public static class Builder {

		private int id;
		private final String name;
		private final String contact;
		private final String email;
		private String gstin;
		private HashMap<String, String> notes;
		private long created_at;

		/**
		 * Instantiates a new builder.
		 *
		 * @param name    the name
		 * @param contact the contact
		 * @param email   the email
		 */
		public Builder(String name, String contact, String email) {
			this.name = name;
			this.contact = contact;
			this.email = email;
		}

		/**
		 * Sets the id.
		 *
		 * @param id the id
		 * @return the builder
		 */
		public Builder setId(int id) {
			this.id = id;
			return this;
		}

		/**
		 * Sets the gstin.
		 *
		 * @param gstin the gstin
		 * @return the builder
		 */
		public Builder setGstin(String gstin) {
			this.gstin = gstin;
			return this;

		}

		/**
		 * Sets the notes.
		 *
		 * @param notes the notes
		 * @return the builder
		 */
		public Builder setNotes(HashMap<String, String> notes) {
			this.notes = notes;
			return this;
		}

		/**
		 * Sets the created at.
		 *
		 * @param created_at the created at
		 * @return the builder
		 */
		public Builder setCreated_at(long created_at) {
			this.created_at = created_at;
			return this;
		}

		/**
		 * Builds MyCustomer.
		 *
		 * @return MyCustomer using the Builder Pattern
		 */
		public MyCustomer build() {
			return new MyCustomer(this);
		}

	}

	// ACCESSORS.
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */

	public int getId() {
		return id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the contact.
	 *
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Gets the gstin.
	 *
	 * @return the gstin
	 */
	public String getGstin() {
		return gstin;
	}

	/**
	 * Gets the notes.
	 *
	 * @return the notes
	 */
	public HashMap<String, String> getNotes() {
		return notes;
	}

	/**
	 * Gets the created at.
	 *
	 * @return the created at
	 */
	public long getCreated_at() {
		return created_at;
	}

	@Override
	public String toString() {

		return new StringJoiner(" | ", MyCustomer.class.getSimpleName() + " -> [", "]").add("Name: " + name)
				.add("Contact#: " + contact).add("E-Mail:	" + email).toString();
	}

}