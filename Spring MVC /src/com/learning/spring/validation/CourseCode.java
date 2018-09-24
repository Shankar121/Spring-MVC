package com.learning.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	public String value() default "COD";
	
	public String message() default "must start with COD";
	
	
	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};
	
	
	
}
