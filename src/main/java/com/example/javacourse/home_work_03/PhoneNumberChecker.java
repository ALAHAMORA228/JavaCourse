package com.example.javacourse.home_work_03;

import com.example.javacourse.home_work_03.interfaces.IsThereSmtng;
import com.example.javacourse.home_work_03.interfaces.PhoneNumberConstraint;
import org.springframework.validation.annotation.Validated;

@Validated
public class PhoneNumberChecker {
    @IsThereSmtng
    @PhoneNumberConstraint
    String userPhoneNumber;
}
