package com.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Foo extends AbstractFoo<GenericType> {

	static final Logger log = LoggerFactory.getLogger(Foo.class);

	public void doSomethingWithGenericTypeClass() {
		log.info("Java generic type is " + getJavaGenericType().getName());
		log.info("Spring generic type is " + getSpringGenericType().getName());
	}

}
