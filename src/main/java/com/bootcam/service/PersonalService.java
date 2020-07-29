package com.bootcam.service;

import com.bootcam.model.Bussines;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalService {
	
	
	Mono<PersonalService> save(PersonalService personalservice);
	Mono<PersonalService> update(PersonalService personalservice);
	Mono<PersonalService> findOne(PersonalService id);
	Mono<Boolean> delete(String id);
	Flux<PersonalService> findAll();

}
