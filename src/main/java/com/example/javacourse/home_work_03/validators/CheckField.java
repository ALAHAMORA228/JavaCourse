package com.example.javacourse.home_work_03.validators;


import com.example.javacourse.home_work_03.interfaces.IsThereSmtng;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

import javax.validation.constraints.NotNull;

public class CheckField implements ConstraintValidator<IsThereSmtng, String> {
    @Override
    public void initialize(IsThereSmtng smtng){

    }
    @Override
    public boolean isValid(@NonNull @NotBlank String number, ConstraintValidatorContext constraintValidatorContext) {
        return true;
    }
}
