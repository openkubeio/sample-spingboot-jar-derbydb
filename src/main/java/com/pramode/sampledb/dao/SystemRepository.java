package com.pramode.sampledb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.pramode.sampledb.model.SystemAudit;

@Repository
public interface SystemRepository extends CrudRepository<SystemAudit,Long> {
	

}
