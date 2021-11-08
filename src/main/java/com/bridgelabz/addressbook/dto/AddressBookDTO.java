package com.bridgelabz.addressbook.dto;

import javax.validation.constraints.Pattern;

import lombok.ToString;

public @ToString class AddressBookDTO {
	@Pattern(regexp = "^[A-Z|a-z]{2,}$",message ="First Name Invalid")
	public String firstName;
	@Pattern(regexp = "^[A-Z|a-z]{2,}$",message ="Last Name Invalid")
	public String lastName;
	
	public String address;
	public String city;
	public String state;
	@Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$",message ="Zip invalid")
	public int zip;
	@Pattern(regexp = "^[0-9]{2,3}\\\\s[0-9]{10}$",message ="Phone number invalid")
	public long phoneNumber;
	@Pattern(regexp = "^[a-zA-Z]{1,}([\\.\\_\\-\\+]?[a-zA-Z0-9]+)@[a-z0-9]+[.][a-z]+[.]?[a-z]{2,3}?$\"",message ="Email invalid")
	public String email;
	
	
}
