package com.rest.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WelcomeService {

	String apiUrl = "http://localhost:8080";

	public void invokeWelcomeApi() {

		// rest templet class follow builder design pattern
		// RestTemplet is a class so that we can directly create its object using new
		// keyword
		RestTemplate rt = new RestTemplate();

		// set uid and pass
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("kiran", "kiran123");

		// pass headers
		HttpEntity<String> reqEntity = new HttpEntity<>(headers);

		ResponseEntity<String> responseEntity = rt.exchange(apiUrl, HttpMethod.GET, reqEntity, String.class);

		// ResponseEntity<String> responseEntity = rt.getForEntity(apiUrl,
		// String.class);

		String body = responseEntity.getBody();
		System.out.println(body);
	}

	public void invokeWelcome() {
//Webclient is a interface so that we cant create its object using new keyword
		WebClient webClient = WebClient.create();
         String block = webClient.get()
		          .uri(apiUrl)
		          .headers(header->header.setBasicAuth("kiran","kiran123"))
		          .retrieve()
		          .bodyToMono(String.class)
		          .block();
         System.out.println(block);
	}
}
