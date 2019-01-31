package com.verizon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Application;
import com.verizon.repo.ApplicationRepository;
import com.verizon.model.Vast;
import com.verizon.repo.VastRepository;


@RestController
public class ApplicationController {

	@Autowired
	ApplicationRepository repository;
	
	@Autowired
	VastRepository vastrepository;

	@GetMapping(value = "/application", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Application> getAll() {
		List<Application> list = new ArrayList<Application>();
		Iterable<Application> apps = repository.findAll();

		apps.forEach(list::add);
		return list;
	}

	@PostMapping(value = "/saveApplication")
	public Application saveApplication(@RequestBody Application application) {
		application.setStatus("ACTIVE");
		repository.save(new Application(application.getAppName(), application.getAppVastId(),
				 application.getContentType(), "ACTIVE"));
		return application;
	}
	
	@PutMapping(value="/application/{id}")
	public void putApplication(@RequestBody Application application, @PathVariable int id){
		System.out.println("Application ::: "+id);
		System.out.println("Application ::: "+application.getAppName());
		
	}
	
	@GetMapping(value = "/findbyappname/{appName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Application> findbyappname(@PathVariable String appName) {

		List<Application> apps = repository.findByAppName(appName);
		return apps;
	}
	
	@GetMapping(value = "/findbyvastapplid/{vastApplID}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Vast findbyvastapplid(@PathVariable String vastApplID) {
		Vast vastapps = vastrepository.findByVastApplID(vastApplID);
		return vastapps;
	}
	
	@GetMapping(value = "/findbyappvastid/{appVastId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Application> findbyappvastid(@PathVariable String appVastId) {

		List<Application> apps = repository.findByAppVastId(appVastId);
		for (Application a : apps) {
		System.out.println("App Name ::: "+a.getAppName());
		}
		return apps;
	}
	
	@DeleteMapping(value = "/application/{appDetId}")
	public void deleteApplication(@PathVariable long appDetId) {

		repository.delete(appDetId);
	}
}