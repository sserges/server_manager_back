package com.devlabs.server;

import com.devlabs.server.enumeration.Status;
import com.devlabs.server.model.Server;
import com.devlabs.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo) {
		return args -> {
			serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server_up.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.58", "Fedora Linus", "16 GB", "Dell Tower", "http://localhost:8080/server/image/server_down.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.21", "MS 2008", "32 GB", "Web Server", "http://localhost:8080/server/image/server_up.png", Status.SERVER_UP));
			serverRepo.save(new Server(null, "192.168.1.14", "Red Hat", "64 GB", "Mail Server", "http://localhost:8080/server/image/server_down.png", Status.SERVER_UP));
		};
	}

}
