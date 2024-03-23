package com.example.javacourse.home_work_03.validators;

import com.example.javacourse.home_work_03.interfaces.PhoneNumberConstraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumberConstraint,String> {
    @Override
    public void initialize(PhoneNumberConstraint validatorInterface){

    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext context){
        return contactField.startsWith("+") && contactField.length()<=14;
    }
}
