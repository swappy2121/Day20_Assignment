package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplyingRule2 {
    static Scanner scanner = new Scanner(System.in);


    public void verifyingFirstName() {
        System.out.println("Enter the first name: ");
        String name = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);

        if (match.matches()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is invalid, Try with another name.");
        }
    }

    public void verifyingLastName() {

        System.out.println("Enter the last name: ");
        String name = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
        Matcher match = pattern.matcher(name);

        if (match.matches()) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is invalid, Try with another name.");
        }
    }

    public void verifyingEmail() {

        System.out.println("Enter the email: ");
        String mail = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}+$");
        Matcher match = pattern.matcher(mail);

        if (match.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid, Try with another name.");
        }
    }

    public void VerifyingMobileNumber() {
        System.out.println("Enter the mobile number with country code: ");
        String mobNo = scanner.next();
        Pattern pattern = Pattern.compile("^[0-9]{2}\s[0-9]{10}$");
        Matcher match = pattern.matcher(mobNo);

        if (match.matches()) {
            System.out.println("Mobile number is valid");
        } else {
            System.out.println("Mobile Number is invalid, Try with another number.");
        }
    }

    public void applyingRuleOne() {
        System.out.println("Enter characters for first rule: ");
        String one = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]{8,}$");
        Matcher match = pattern.matcher(one);

        if (match.matches()) {
            System.out.println("First Rule is valid");
        } else {
            System.out.println("First Rule is invalid, Try another.");
        }
    }


    public void applyingRuleTwo() {
        System.out.println("Enter characters for second rule: ");
        String one = scanner.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1,}[a-zA-Z]{7,}$");
        Matcher match = pattern.matcher(one);

        if (match.matches()) {
            System.out.println("Second Rule is valid");
        } else {
            System.out.println("Second Rule is invalid, Try another.");
        }
    }


    public static void main(String[] args) {

        ApplyingRule2 check = new ApplyingRule2();
        check.applyingRuleTwo();
    }
}
