package br.com.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {
	
	@Autowired
	public RestTemplate restTemplate;
	
	public String getResponseProjectWeb() {
		return restTemplate.getForObject("http://localhost:8080/v1/web", String.class);
	}
}
