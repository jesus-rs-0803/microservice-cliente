package com.bootcam.service.impl;

import org.springframework.stereotype.Service;

import com.bootcam.service.PersonalService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class PersonalServiceImpl implements PersonalService {

	@Override
	public Mono<PersonalService> save(PersonalService personalservice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<PersonalService> update(PersonalService personalservice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<PersonalService> findOne(PersonalService id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Boolean> delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<PersonalService> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
