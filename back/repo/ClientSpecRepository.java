package com.verizon.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.verizon.model.ClientSpec;

public interface ClientSpecRepository extends CrudRepository<ClientSpec, Long> {
	List<ClientSpec> findByAppName(String appName);
	List<ClientSpec> findByclientip(String clientip);
}
