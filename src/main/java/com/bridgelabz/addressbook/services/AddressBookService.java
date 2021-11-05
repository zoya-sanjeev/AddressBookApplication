package com.bridgelabz.addressbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{

	@Override
	public List<AddressBookData> getAddressBookData() {
		List<AddressBookData> addressBookList = new ArrayList<>();
		addressBookList.add(new AddressBookData(1, new AddressBookDTO("Zoya", "Sanjeev",
				"jpnagar", "hyderabad", "telangana", 500100,Long.valueOf(800990990),"zoya@gmail.com")));
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		AddressBookData addrBookData = null;
		addrBookData = new AddressBookData(1,new AddressBookDTO("Zoya", "Sanjeev",
				"jpnagar", "hyderabad", "telangana", 500100,Long.valueOf(800990990),"zoya@gmail.com"));
		return null;
	}

	@Override
	public AddressBookData createAddressBookDaat(AddressBookDTO addressBookDTO) {
		AddressBookData addrBookData = null;
		addrBookData = new AddressBookData(1, addressBookDTO);
		return addrBookData;
	}

	@Override
	public AddressBookData updateAddressBopkData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData addrBookData = null;
		addrBookData = new AddressBookData(1, addressBookDTO);
		return addrBookData;
	}

	@Override
	public void deleteAddressBookData(int id) {
		
		
	}

}
