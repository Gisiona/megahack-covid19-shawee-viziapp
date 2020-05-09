package br.com.vizi.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RequestMapping("/viziapp/v1")
public class HealthController {

	@GetMapping("/healthcheck")
	public String healthcheck(){		
		return "200 OK";
	}
}
