package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FooTest {

	Foo foo = new Foo();
	Class<?> genericType = GenericType.class;

	@Test
	public void testJavaGenericType() {
		Class<?> javaClass = this.foo.getJavaGenericType();
		assertEquals(javaClass, this.genericType);
	}

	@Test
	public void testSpringGenericType() {
		Class<?> springClass = this.foo.getSpringGenericType();
		assertEquals(springClass, this.genericType);
	}

}
