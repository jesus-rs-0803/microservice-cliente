package com.bootcam.service;

import com.bootcam.model.Bussines;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BussinesService {

	
	
	Mono<Bussines> save(Bussines bussines);
	Mono<Bussines> update(Bussines bussines);
	Mono<Bussines> findOne(String id);
	Mono<Boolean> delete(String id);
	Flux<Bussines> findAll();
	
}
