package com.verizon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.verizon.model.AppSpecific;
import com.verizon.repo.AppSpecificRepository;

@RestController
public class AppSpecificController {

	@Autowired
	AppSpecificRepository repository;
		
	@GetMapping(value = "/findbyusageappname/{appName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AppSpecific> findbyusageappname(@PathVariable String appName) {

		List<AppSpecific> apps = repository.findByAppName(appName);
		return apps;
	}
	
	@GetMapping(value = "/application-specific", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AppSpecific> getAll() {
		List<AppSpecific> list = new ArrayList<AppSpecific>();
		Iterable<AppSpecific> appspecific = repository.findAll();
		appspecific.forEach(list::add);
		return list;
	}
	
}
