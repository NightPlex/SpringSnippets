package com.hybris.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author Steven
 *
 *         Interface to implement custom validation code
 *
 *
 *
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE }) // Only Field is needed if using for
											// entity
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = com.hybris.validation.ValidEmailImpl.class) // the
																		// implementation
																		// class
public @interface ValidEmail {

	String message() default "{javax.validation.constraints.Size.message}"; // can
																			// be
																			// anything

	Class<?>[] groups() default {}; // required

	Class<? extends Payload>[] payload() default {}; // required

	int size() default 1; // npt required

}
