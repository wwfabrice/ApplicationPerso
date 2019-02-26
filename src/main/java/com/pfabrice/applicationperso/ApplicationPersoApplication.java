package com.pfabrice.applicationperso;

import com.pfabrice.applicationperso.security.services.PreLaunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationPersoApplication {

	@Autowired
	private PreLaunchService preLaunchService;

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return new CommandLineRunner() {
			public void run(String... args) throws Exception {
				preLaunchService.createFirstAdmin();
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPersoApplication.class, args);
	}

}
