package com.bridgelabz.addressbook.controllers;

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

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		AddressBookData addressBookdata = null;
		addressBookdata = new AddressBookData(1, new AddressBookDTO("Zoya", "Sanjeev",
				"jpnagar", "hyderabad", "telangana", 500100,Long.valueOf(800990990),"zoya@gmail.com"));
		ResponseDTO respDTO = new ResponseDTO("Get Call Success",addressBookdata); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("id") int id){
		AddressBookData addressBookdata = null;
		addressBookdata = new AddressBookData(1, new AddressBookDTO("Zoya", "Sanjeev",
				"jpnagar", "hyderabad", "telangana", 500100,Long.valueOf(800990990),"zoya@gmail.com"));
		ResponseDTO respDTO = new ResponseDTO("Get Call for id Success",addressBookdata); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(
				@RequestBody AddressBookDTO addrBookDTO){
		AddressBookData addressBookdata = null;
		addressBookdata = new AddressBookData(1, addrBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created Address Book Data Successfully",addressBookdata); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("id") int id,
			@RequestBody AddressBookDTO addrBookDTO){
		AddressBookData addressBookdata = null;
		addressBookdata = new AddressBookData(id, addrBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Updated Address Book Data Successfully",addressBookdata); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("id") int id){
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully","Deleted id:" +id); 
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

}
