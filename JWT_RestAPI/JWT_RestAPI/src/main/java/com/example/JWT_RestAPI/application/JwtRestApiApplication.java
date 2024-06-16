package com.example.JWT_RestAPI.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * A classe JwtRestApiApplication serve como o ponto de entrada para a aplicação Spring Boot.
 * Ela habilita a auto-configuração, varredura de componentes e configuração de repositórios MongoDB.
 */
@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories(basePackages = "com.example.JWT_RestAPI.repository")
public class JwtRestApiApplication {

	/**
	 * O método principal que inicia a aplicação Spring Boot.
	 *
	 * @param args argumentos de linha de comando (não usados).
	 */
	public static void main(String[] args) {
		SpringApplication.run(JwtRestApiApplication.class, args);
	}
}
