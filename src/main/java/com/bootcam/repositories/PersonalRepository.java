package com.bootcam.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcam.model.Personal;

@Repository
public interface PersonalRepository extends ReactiveMongoRepository<Personal, String> {

}
