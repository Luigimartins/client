package br.com.client.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.client.service.HomeService;

@CrossOrigin
@RestController
@RequestMapping("v1/client")
public class HomeController {
	
	@Autowired
	private HomeService service;
	
	@GetMapping
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("Projeto Client:" + service.getResponseProjectWeb());
	}
}
