package com.verizon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Application;
import com.verizon.model.UserAudit;
import com.verizon.repo.UserAuditRepository;

@RestController
public class UserAuditController {

	@Autowired
	UserAuditRepository repository;

	@GetMapping(value = "/getbyapp/{appName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserAudit> findbyappname(@PathVariable String appName) {

		List<UserAudit> apps = repository.findByAppName(appName);
		return apps;
	}
	
	@GetMapping(value = "/user-audit", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserAudit> getAll() {
		System.out.println("get All LL ");
		List<UserAudit> list = new ArrayList<UserAudit>();
		Iterable<UserAudit> useraudits = repository.findAll();

		useraudits.forEach(list::add);
		return list;
	}


}