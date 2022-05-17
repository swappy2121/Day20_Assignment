package com.Bridgelabz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyingEmail {
    static Scanner scanner = new Scanner(System.in);


    public void validatingFirstName() {
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

    public void validatingLastName() {

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

    public void validatingEmail() {

        System.out.println("Enter the email: ");
        String mail = scanner.next();
        Pattern pattern = Pattern.compile("^[a-zA-Z]+[.][A-Za-z]+@[a-zA-Z]+[.]+[a-zA-Z]{2}+[.][A-Za-z]{2}$");
        Matcher match = pattern.matcher(mail);

        if (match.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email is invalid, Try with another name.");
        }
    }

    public static void main(String[] args) {

        VerifyingEmail check = new VerifyingEmail();
        check.validatingEmail();
    }
}

