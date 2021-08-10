package com.example.test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.core.GenericTypeResolver;

public abstract class AbstractFoo<T> {

	private Class<T> javaGenericType;
	private Class<T> springGenericType;

	public AbstractFoo() {

		// Pure Java solution to get generic type
		Class<?> thisClass = getClass();
		Type genericSuperclass = thisClass.getGenericSuperclass();
		ParameterizedType parameterizedGenericSuperclass = (ParameterizedType) genericSuperclass;
		Type[] typeArgs = parameterizedGenericSuperclass.getActualTypeArguments();
		this.javaGenericType = (Class<T>) typeArgs[0];

		// Spring solution to get generic type
		this.springGenericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), AbstractFoo.class);

	}

	protected Class<?> getJavaGenericType() {
		return this.javaGenericType;
	}

	protected Class<?> getSpringGenericType() {
		return this.springGenericType;
	}

}
