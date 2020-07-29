package com.bootcam.repositories;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcam.model.Bussines;

@Repository
public interface BussinesRepository extends ReactiveMongoRepository<Bussines,String> {
	
	
	

}
