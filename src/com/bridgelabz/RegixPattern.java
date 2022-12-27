package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegixPattern {
    private Pattern pattern;

    private Matcher matcher;

    public boolean isFirstNameValid(String firstName) {
        String regex = "[A-Z][a-z]{2,15}";
        pattern = Pattern.compile(regex);
         matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
    public boolean isLastNameValid(String lastName) {
        String regex = "[A-Z][a-z]{2,15}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
    public boolean isStateValid(String State) {
        String regex = "[A-Z][a-z]{2,15}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(State);
        return matcher.matches();
    }
    public boolean isCityValid(String City) {
        String regex = "[A-Z][a-z]{2,15}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(City);
        return matcher.matches();
    }
    public boolean isAddressValid(String Address) {
        String regex = "[A-Z][a-z]{2,15}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(Address);
        return matcher.matches();
    }
//    public boolean isEmailValid(String Email) {
//        String regex = "^[a-zA-Z0-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
//        pattern = Pattern.compile(regex);
//        matcher = pattern.matcher(Email);
//        return matcher.matches();
//    }
//    /**
//     * list of valid mail Id's
//     */
//        emails.add("abc@yahoo.com");
//        emails.add("abc-100@yahoo.com");
//        emails.add("abc.100@yahoo.com");
//        emails.add("abc111@abc.com");
//        emails.add("abc-100@abc.net");
//        emails.add("abc.100@abc.com.au");
//        emails.add("abc@1.com");
//        emails.add("abc@gmail.com.com");
//        emails.add("abc+100@gmail.com");
//
//    /**
//     * list of Invalid mail Id's
//     */
//        emails.add("abc");
//        emails.add("abc@.com.my");
//        emails.add("abc123@gmail.a");
//        emails.add("abc123@.com");
//        emails.add("abc123@.com.com");
//        emails.add(".abc@abc.com");
//        emails.add("abc()*@gmail.com");
//        emails.add("abc@%*.com");
//        emails.add("abc..2002@gmail.com");
//        emails.add("abc.@gmail.com");
//        emails.add("abc@abc@gmail.com");
//        emails.add("abc@gmail.com.1a");
//        emails.add("abc@gmail.com.aa.au");
//
//        for (String Email:emails){
//        if (contact1.isEmailValid(Email))
//            System.out.println(Email + " Valid Email");
//        else
//            System.out.println(Email + " Invalid Email");
//
//    }
    public boolean isZipValid(String Zip) {
        String regex = "[0-9]{6,}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(Zip);
        return matcher.matches();
    }
    public boolean isPhoneNumberValid(String PhoneNumber) {
        String regex = "^([0-9]{2}\\s)?[6789]{1}[0-9]{9}";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(PhoneNumber);
        return matcher.matches();
    }
}
