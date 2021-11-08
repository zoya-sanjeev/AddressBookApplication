package com.bridgelabz.addressbook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.exceptions.AddressBookException;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService{

	@Autowired
	private AddressBookRepository addressRepository;
	private List<AddressBookData> addressBookList = new ArrayList();
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int id) {
		return addressBookList.stream()
				.filter(addData -> addData.getId() == id)
				.findFirst()
				.orElseThrow(() -> new AddressBookException("Address not found"));
	}

	@Override
	public AddressBookData createAddressBookDaat(AddressBookDTO addressBookDTO) {
		AddressBookData addrBookData = null;
		addrBookData = new AddressBookData( addressBookDTO);
		addressBookList.add(addrBookData);
		log.debug("Contact data:" + addrBookData.toString());
		return addressRepository.save(addrBookData);
	}

	@Override
	public AddressBookData updateAddressBopkData(int id, AddressBookDTO addressBookDTO) {
		AddressBookData addrBookData = this.getAddressBookDataById(id);
		addrBookData.setFirstName(addressBookDTO.firstName);
		addrBookData.setLastName(addressBookDTO.lastName);
		addrBookData.setAddress(addressBookDTO.address);
		addrBookData.setCity(addressBookDTO.city);
		addrBookData.setState(addressBookDTO.state);
		addrBookData.setZip(addressBookDTO.zip);
		addrBookData.setPhoneNumber(addressBookDTO.phoneNumber);
		addrBookData.setEmail(addressBookDTO.email);
		return addrBookData;
	}

	@Override
	public void deleteAddressBookData(int id) {
		addressBookList.remove(id -1);
		
	}

}
