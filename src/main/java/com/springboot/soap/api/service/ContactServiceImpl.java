package com.springboot.soap.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.soap.api.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	
	//Fake Service
	
	List<Contact> contacts = List.of(
				new Contact((long) 132, "aksh@gmail.com", "Akshay", (long) 1321),
				new Contact((long) 133, "askhaya@yahoo.com", "Akshay", (long) 1321),
				new Contact((long) 134, "kemekar@gmail.com", "Tirupati", (long) 1421),
				new Contact((long) 135, "kemekar@yahooo.com", "Tirupati", (long) 1421),
				new Contact((long) 136, "kems@redit.com", "Tirupati", (long) 1421),
				new Contact((long) 137, "shankar@gmail.com", "Shankar", (long) 12521),
				new Contact((long) 138, "shankar@yahoo.com", "Shankar", (long) 12521)
			);
	
	
	@Override
	public List<Contact> getContactsofUser(Long userId) {
		
		return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
