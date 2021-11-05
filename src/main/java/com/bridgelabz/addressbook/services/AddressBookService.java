package com.bridgelabz.addressbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService{

	private List<AddressBookData> addressBookList = new ArrayList();
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		return addressBookList.get(id-1);
	}

	@Override
	public AddressBookData createAddressBookDaat(AddressBookDTO addressBookDTO) {
		AddressBookData addrBookData = null;
		addrBookData = new AddressBookData(1, addressBookDTO);
		addressBookList.add(addrBookData);
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
