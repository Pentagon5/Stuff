package com.verizon.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.verizon.model.UserAudit;

public interface UserAuditRepository extends CrudRepository<UserAudit, Long> {

	List<UserAudit> findByAppName(String appName);

}