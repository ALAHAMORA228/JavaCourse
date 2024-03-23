package com.example.javacourse.home_work_03.interfaces;

import com.example.javacourse.home_work_03.validators.CheckField;

import jakarta.validation.Payload;
import lombok.NonNull;

import javax.validation.Constraint;
import javax.validation.constraints.NotBlank;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = CheckField.class)
@Documented
public @interface IsThereSmtng {
    String message() default "Invalid phone number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
