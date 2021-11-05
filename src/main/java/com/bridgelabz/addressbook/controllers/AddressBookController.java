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

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
	
	@RequestMapping(value = {"", "/", "/get"})
	public ResponseEntity<String> getAddressBookData(){
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<String> getAddressBookData(@PathVariable("id") int id){
		return new ResponseEntity<String>("Get Call Success for id : " + id, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(
				@RequestBody AddressBookDTO addrBookDTO){
		return new ResponseEntity<String>("Created Address Book Data for: "
				+ addrBookDTO, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateAddressBookData(
			@RequestBody AddressBookDTO addrBookDTO){
		return new ResponseEntity<String>("Updated Address Book Data for: "
				+ addrBookDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteAddressBookData(@PathVariable("id") int id){
		return new ResponseEntity<String>("Delete Call Success for id: " + id, HttpStatus.OK);
	}

}
