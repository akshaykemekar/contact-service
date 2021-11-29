package com.springboot.soap.api.service;

import java.util.List;

import com.springboot.soap.api.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsofUser(Long userId);
	
}
