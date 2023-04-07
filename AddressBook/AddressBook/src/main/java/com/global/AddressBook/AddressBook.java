package com.global.AddressBook;
import java.util.List;
import java.util.stream.Collectors;

import com.global.T.Trie;

public class AddressBook {

	private Trie<Contact> contacts;

	public AddressBook() {
		 contacts = new Trie<>();
	}

	public void addContact(Contact contact) throws Exception {
		if (contacts.search(contact.getName()).isEmpty()) {
			contacts.insert(contact.getName(), contact);
		} else
			throw new Exception();
	}

	public void deleteContact(String name) throws Exception {
		List<Contact> contact = contacts.search(name);
		if (!contact.isEmpty()) {
			contacts.delete(name, contact.get(0));
		} else
			throw new Exception();
	}

	public void updateContact(String name, Contact contact) throws Exception {
		if (contacts.search(name).isEmpty()) {
			throw new Exception();
		} else {
			deleteContact(name);
			contacts.insert(name, contact);
		}
	}

	public List<Contact> searchByName(String name) {
		List<Contact> allContacts = contacts.search("");

		List<Contact> searchedWithName = allContacts.stream()
				.filter(c -> c.getName().toLowerCase().startsWith(name.toLowerCase())).collect(Collectors.toList());
		return searchedWithName;
	}

	public List<Contact> searchByOrganisation(String organisation) throws Exception {
		List<Contact> allContacts = contacts.search("");

		List<Contact> searchedWithOrg = allContacts.stream()
				.filter(c -> c.getOrganisation().toLowerCase().startsWith(organisation.toLowerCase())).collect(Collectors.toList());
		return searchedWithOrg;
	}

}
