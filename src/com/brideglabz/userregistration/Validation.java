package com.brideglabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
    Scanner sc=new Scanner(System.in);

    public void checkFirstName(){
        System.out.println("Enter First Name : ");
        String firstName=sc.next();
        if (Pattern.matches("^[A-Z]{1}[a-z]{3,}",firstName)){
            System.out.println("First Name is Valid...");
        }else {
            System.out.println("First Name is Invalid.....");
        }
    }
}
