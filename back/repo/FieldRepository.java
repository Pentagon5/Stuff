package com.verizon.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.verizon.model.Application;
import com.verizon.model.Field;

public interface FieldRepository extends CrudRepository<Field, Integer> {
	List<Field> findByFieldName(String fieldName);
	Field findByFieldId(int fieldId);
	List<Field> findFieldByAppName(String appName);
}