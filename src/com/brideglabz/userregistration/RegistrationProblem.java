package com.brideglabz.userregistration;

public class RegistrationProblem {
    public static void main(String[] args) {
        System.out.println("Welcome to Regular Expressions program to validate PIN code!");
        Validation validation=new Validation();
        validation.checkFirstName();
        validation.checkLastName();
        validation.checkEmail();
        validation.checkPhoneNumber();
        validation.checkPasswordRule1();
        validation.checkPasswordRule2();
        validation.checkPasswordRule3();
    }
}
