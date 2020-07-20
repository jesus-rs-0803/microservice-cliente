package com.bootcam.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcam.entities.Client;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
	
	

}
