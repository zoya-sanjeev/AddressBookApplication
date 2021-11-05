package com.bridgelabz.addressbook.services;

import java.util.List;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

public interface IAddressBookService {
	
	List<AddressBookData> getAddressBookData();
	
	AddressBookData getAddressBookDataById(int id);
	
	AddressBookData createAddressBookDaat(AddressBookDTO addressBookDTO);
	
	AddressBookData updateAddressBopkData(int id, AddressBookDTO addressBookDTO);
	
	void deleteAddressBookData(int id);

}
