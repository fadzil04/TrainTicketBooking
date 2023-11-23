package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dataentity;
import com.example.demo.repository.Detailsrepo;

@RestController
public class Traincontroller {
	@Autowired
	
	private Detailsrepo repo;
@PostMapping("/addpassanger")
public Dataentity addpassanger(@RequestBody Dataentity dt) {
	try {
		repo.save(dt);
		return dt;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	
}
@GetMapping("/getpassanger")
public List<Dataentity>getpassanger() {
	try {
	return repo.findAll();
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	
}
@PutMapping("/updatepassanger")
public Dataentity updatepassanger(@RequestBody Dataentity dt) {
	try {
		repo.save(dt);
		return dt;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	
}
@DeleteMapping("/deletepassanger/{Id}")
public String deletepassanger(@PathVariable int Id) {
	try {
		Dataentity dt=repo.getOne(Id);
		repo.delete(dt);
		return "passanger deleted";
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	
}
}
