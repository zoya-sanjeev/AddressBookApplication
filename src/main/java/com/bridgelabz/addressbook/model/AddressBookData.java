package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressBookDTO;

import lombok.Data;

public @Data class AddressBookData {
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private long phoneNumber;
	private String email;
	
	public AddressBookData(int id, AddressBookDTO addressBookDTO) {
		this.id = id;
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
		this.address = addressBookDTO.address;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zip = addressBookDTO.zip;
		this.phoneNumber = addressBookDTO.phoneNumber;
		this.email = addressBookDTO.email;
	}
	
	public AddressBookData() {
		
	}
}
