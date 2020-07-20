package com.bootcam.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcam.entities.Client;
import com.bootcam.repositories.ClientRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/client/{id}")
	public ResponseEntity<Client> findbyId(@PathVariable("id") String id){
		Optional<Client> c= clientRepository.findById(id);
		return ResponseEntity.ok(c.orElse(null));
	}
	
	@PostMapping(value = "/client",consumes = "application/json")
	public ResponseEntity<Client> save(@RequestBody Client c){
		Client result= clientRepository.save(c);
		return ResponseEntity.ok(result);
		
	}
	
	

}
