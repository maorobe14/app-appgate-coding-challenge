package com.appgate.codingchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@EnableAsync
@SpringBootApplication
public class CodingchallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingchallengeApplication.class, args);
	}

	@Bean
	public Executor executor() {
		return new ThreadPoolTaskExecutor();
	}

}
