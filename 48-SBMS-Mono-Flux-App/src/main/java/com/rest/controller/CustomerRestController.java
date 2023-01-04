package com.rest.controller;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.binding.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestController {

	@GetMapping(value="/event" ,produces="application/json")
	public ResponseEntity<Mono<CustomerEvent>> getEvent() {
		CustomerEvent event = new CustomerEvent("Kiran", new Date());
		Mono<CustomerEvent> customerMono = Mono.just(event);
		return new ResponseEntity<Mono<CustomerEvent>>(customerMono, HttpStatus.OK);
	}
	
	@GetMapping(value="/events" ,produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getEvents(){
		//Creating binding object with data 
		CustomerEvent event = new CustomerEvent("Kiran", new Date());
	
		//Creating stream for binding object
		Stream<CustomerEvent> customerStream = Stream.generate(() -> event);
		
		//Create flux object using stream
		Flux<CustomerEvent> flux = Flux.fromStream(customerStream);
		
		//Setting Response interval 
		Flux<Long> intervalFlux = Flux.interval(Duration.ofSeconds(1));
          
		//combine interval Flux and customer event flux 
		
		Flux<Tuple2<Long, CustomerEvent>> zip = Flux.zip(intervalFlux, flux);
		
		//Getting tuple value as t2
		Flux<CustomerEvent> fluxMap = zip.map(Tuple2::getT2);
		
		//sending response
		return new ResponseEntity<Flux<CustomerEvent>>(fluxMap,HttpStatus.OK);
	}
}
