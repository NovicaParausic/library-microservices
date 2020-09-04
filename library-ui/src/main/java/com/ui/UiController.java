package com.ui;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class UiController {

	private final RestTemplate restTemplate;

	public UiController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@GetMapping(value = "classes")
	public ResponseEntity<String> getString() {
		return restTemplate.exchange("http://library-service", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				});
	}

}
