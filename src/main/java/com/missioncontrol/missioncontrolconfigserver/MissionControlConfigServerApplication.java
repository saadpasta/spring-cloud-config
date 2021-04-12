package com.missioncontrol.missioncontrolconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MissionControlConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissionControlConfigServerApplication.class, args);
	}

}
