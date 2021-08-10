package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericTypeResolverTestApplication {

	static final Logger log = LoggerFactory.getLogger(GenericTypeResolverTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(GenericTypeResolverTestApplication.class, args);

		log.info("Application started");
		Foo foo = new Foo();
		foo.doSomethingWithGenericTypeClass();
		log.info("Application finished");
	}

}
