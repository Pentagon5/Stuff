package com.verizon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.ClientSpec;
import com.verizon.repo.ClientSpecRepository;

@RestController
public class ClientSpecController {
	
	@Autowired
	ClientSpecRepository repository;
	
	
	@GetMapping(value = "/findbyclientusageappname/{appName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ClientSpec> findbyclientusageappname(@PathVariable String appName) {

		List<ClientSpec> apps = repository.findByAppName(appName);
		return apps;
	}
	@GetMapping(value = "/findbyclientusageip/{clientip}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ClientSpec> findbyclientusageip(@PathVariable String clientip) {

		List<ClientSpec> ip = repository.findByclientip(clientip);
		System.out.println("By ip: " +clientip);
		return ip;
	}
	
	@GetMapping(value = "/client-specific", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ClientSpec> getAll() {
		List<ClientSpec> list = new ArrayList<ClientSpec>();
		Iterable<ClientSpec> clientspecific = repository.findAll();

		clientspecific.forEach(list::add);
		return list;
	} 
	
}