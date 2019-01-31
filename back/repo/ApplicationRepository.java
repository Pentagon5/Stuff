package com.verizon.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.verizon.model.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
	public static final String FIND_APPNAMES = "SELECT distinct appname FROM rtm_app_details";
	List<Application> findByAppVastId(String appVastId);
	List<Application> findByAppName(String appName);
	@Query(value = FIND_APPNAMES, nativeQuery = true)
	public List<String> getAppList();
}