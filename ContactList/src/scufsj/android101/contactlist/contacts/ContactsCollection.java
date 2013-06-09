package scufsj.android101.contactlist.contacts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing contacts data.
 */
public class ContactsCollection {

	/**
	 * An array of contact items.
	 */
	public static List<Contact> ITEMS = new ArrayList<Contact>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Contact> ITEM_MAP = new HashMap<String, Contact>();
	
	static {
		addContact(new Contact("1", "Dummy Contact 1", "(555) 555-1111", "dummy1@email.com"));
		addContact(new Contact("2", "Dummy Contact 2", "(555) 555-2222", "dummy2@email.com"));
		addContact(new Contact("3", "Dummy Contact 3", "(555) 555-3333", "dummy3@email.com"));
		addContact(new Contact("4", "Dummy Contact 4", "(555) 555-4444", "dummy4@email.com"));
		addContact(new Contact("5", "Dummy Contact 5", "(555) 555-5555", "dummy5@email.com"));
		addContact(new Contact("6", "Bruno Torres", null, "contato@brunotorr.es"));
	}

	public static void addContact(Contact item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class Contact {
		public String id;
		public String name;
		public String phoneNumber;
		public String email;

		public Contact(String id, String name, String phoneNumber, String email) {
			this.id = id;
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}

		@Override
		public String toString() {
			return String.format(
					"<Contact#id=%s, name=%s, phone=%s, email=%s>", id, name,
					phoneNumber, email);
		}
	}
}
