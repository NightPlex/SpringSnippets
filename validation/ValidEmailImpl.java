package com.hybris.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.validator.routines.EmailValidator;

/**
 * @author Steven
 * 
 *         Implementation of custom validation
 *
 */
// ConstraintValidator takes the interface and the type of input
public class ValidEmailImpl implements ConstraintValidator<ValidEmail, String> { // required
																					// implementation

	private int size;

	@Override
	public void initialize(ValidEmail constraintAnnotation) {
		size = constraintAnnotation.size();

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// Determine if it is valid or not
		if (!EmailValidator.getInstance(false).isValid(value) || value.length() < size) {
			return false;
		}

		return true;
	}

}
