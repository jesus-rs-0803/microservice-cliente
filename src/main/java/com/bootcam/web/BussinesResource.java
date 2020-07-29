package com.bootcam.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bootcam.model.Bussines;
import com.bootcam.service.BussinesService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController


public class BussinesResource {
	
	private BussinesService bussinesService;
	

    @PostMapping("/bussines")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Bussines> save(@RequestBody Bussines bussines) {
        return this.bussinesService.save(bussines);
    }

    @DeleteMapping(path = "/{ruc}")
    private Mono<ResponseEntity<String>> delete(@PathVariable String ruc) {
        return bussinesService.delete(ruc)
               .filter(delete -> delete)
               .map(delete -> new ResponseEntity<>("Deleted",HttpStatus.ACCEPTED))
               .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }

    @PutMapping
    private Mono<ResponseEntity<Bussines>> update(@PathVariable("ruc") String id, @RequestBody Bussines bussines) {
        return this.bussinesService.update(bussines)
                .flatMap(message1 -> Mono.just(ResponseEntity.ok(message1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));

    }

    

    @GetMapping(value = "/")
    private Flux<Bussines> findAll() {
        return this.bussinesService.findAll();
    }

	
	

}
