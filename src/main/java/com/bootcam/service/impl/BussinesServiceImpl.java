package com.bootcam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.bootcam.model.Bussines;
import com.bootcam.repositories.BussinesRepository;
import com.bootcam.service.BussinesService;



@Service
public class BussinesServiceImpl implements BussinesService {
	
	private final BussinesRepository bussinesrepository = null;
	
	
	
	

	@Override
	public Mono<Bussines> save(Bussines bussines) {
		// TODO Auto-generated method stub
		return this.bussinesrepository.save(bussines);
	}

	@Override
	public Mono<Bussines> update(Bussines bussines) {
		// TODO Auto-generated method stub
		return bussinesrepository.findById(bussines.getRuc())
				.flatMap(postDB -> bussinesrepository.save(postDB.update(bussines))
						);
	}
				
    @Override
	public Mono<Bussines> findOne(String id) {
		// TODO Auto-generated method stub
		return bussinesrepository.findById(id);
	}

	@Override
	public Mono<Boolean> delete(String id) {
		// TODO Auto-generated method stub
		  return bussinesrepository.findById(id)
	                .flatMap(
	                        post -> bussinesrepository.delete(post).then(Mono.just(Boolean.TRUE))
	                )
	                .defaultIfEmpty(Boolean.FALSE);
	}

	@Override
	public Flux<Bussines> findAll() {
		// TODO Auto-generated method stub
		return bussinesrepository.findAll();
	}

}
