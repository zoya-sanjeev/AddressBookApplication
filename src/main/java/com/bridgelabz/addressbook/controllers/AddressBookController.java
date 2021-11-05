package com.bridgelabz.addressbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.services.IAddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		List<AddressBookData> addressBookList = null;
		addressBookList = addressBookService.getAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get Call Success",addressBookList); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("id") int id){
		AddressBookData addressBookdata = null;
		addressBookdata =addressBookService.getAddressBookDataById(id);
		ResponseDTO respDTO = new ResponseDTO("Get Call for id Success",addressBookdata); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(
				@RequestBody AddressBookDTO addrBookDTO){
		AddressBookData addressBookdata = null;
		addressBookdata = addressBookService.createAddressBookDaat(addrBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully",addressBookdata); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("id") int id,
			@RequestBody AddressBookDTO addrBookDTO){
		AddressBookData addressBookdata = null;
		addressBookdata = addressBookService.updateAddressBopkData(id, addrBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully",addressBookdata); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id){
		addressBookService.deleteAddressBookData(id);
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully","Deleted id:" +id); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}
