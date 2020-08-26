package br.com.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HomeService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${web.url}")
	private String url;
	
	public String getResponseProjectWeb() {
		return restTemplate.getForObject(url, String.class);
	}
}
