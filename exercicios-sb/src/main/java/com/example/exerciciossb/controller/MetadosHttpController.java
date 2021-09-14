package com.example.exerciciossb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metados")
public class MetadosHttpController {
	
	@GetMapping
	public String get() {
		return "requisição GET";
	}
	@PostMapping
	public String post() {
		return "requisição GET";
	}
	@PutMapping
	public String put() {
		return "requisição GET";
	}
	@PatchMapping
	public String patch() {
		return "requisição GET";
	}
	@DeleteMapping
	public String delete() {
		return "requisição GET";
	}


}
