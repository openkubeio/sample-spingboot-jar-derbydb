package com.pramode.sampledb.app;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.pramode.sampledb.dao.SystemRepository;
import com.pramode.sampledb.model.SystemAudit;


@SpringBootApplication
@EnableJpaRepositories("com.pramode.sampledb.dao")
@EntityScan("com.pramode.sampledb.model")
public class App implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	SystemRepository systemRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Our DataSource is = " + dataSource);
		Iterable<SystemAudit> systemlist = systemRepository.findAll();
		for(SystemAudit systemmodel:systemlist){
			System.out.println("Here is a systemAudit: " + systemmodel.toString());
		}
		

	}

}
