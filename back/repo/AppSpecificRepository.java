package com.verizon.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.verizon.model.AppSpecific;

public interface AppSpecificRepository  extends CrudRepository<AppSpecific, Long> {

	List<AppSpecific> findByAppName(String appName);
}
