package com.bridgelabz.addressbook.dto;

public class AddressBookDTO {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public int zip;
	public long phoneNumber;
	public String email;
	
	public AddressBookDTO(String firstName,String lastName, String address,
		String city, String state, int zip, long phoneNumber,String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "AddressBook [name=" + firstName +" "+ lastName+ ", address=" + address +  
				",city="+ city+ ",state"+ state + ",zip="+ zip+", phoneNumber="+ phoneNumber + ", email=" + email + "]";
	}
}
