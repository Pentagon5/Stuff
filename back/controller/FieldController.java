package com.verizon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.model.Field;
import com.verizon.repo.FieldRepository;
import com.verizon.model.UserAudit;
import com.verizon.repo.ApplicationRepository;
import com.verizon.repo.UserAuditRepository;

@RestController
public class FieldController {

	@Autowired
	FieldRepository repository;
	
	@Autowired
	ApplicationRepository applicationRepository;
	
	@Autowired
	UserAuditRepository userAuditRepository;

	@GetMapping(value = "/field", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Field> getAll() {
		List<Field> list = new ArrayList<Field>();
		Iterable<Field> fields = repository.findAll();
		fields.forEach(list::add);
		return list;
	}
	@GetMapping(value = "/findbyname/{fieldName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Field> findbyapp(@PathVariable String fieldName) {

		List<Field> apps = repository.findByFieldName(fieldName);
		return apps;
	}
	@GetMapping(value = "/appNameList", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getAppNameList() {
		List<String> list = new ArrayList<String>();
		Iterable<String> fields = applicationRepository.getAppList() ;

		fields.forEach(list::add);
		return list;
	}
	
	@GetMapping(value = "/findfieldbyappname/{appName}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Field> findfieldbyappName(@PathVariable String appName) {

		List<Field> apps = repository.findFieldByAppName(appName);
		return apps;
	}	
	@DeleteMapping(value = "/field/{fieldId}")
	public void deleteField(@PathVariable Integer fieldId) {
		try{
		
		Field field=repository.findByFieldId(fieldId);
		userAuditRepository.save(new UserAudit(field.getAppName(), field.getFieldName(), "DELETE", String.valueOf(System.currentTimeMillis())));
		repository.delete(fieldId);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@PostMapping(value = "/saveFields")
	public Field saveFields(@RequestBody Field field) {
       
		repository.save(new Field(field.getFieldName(),field.getFieldType(),field.getAppName()));
		userAuditRepository.save(new UserAudit(field.getAppName(), field.getFieldName(), "ADD", String.valueOf(System.currentTimeMillis())));
		return field;
	}

}