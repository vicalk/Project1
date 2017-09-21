package com.project1;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringForma {


    public  String getPlateNo() throws Exception {

        int count = 0;
        int maxTries = 3;
        while(true) {
            try {
                // Some Code
                // break out of loop, or return, on success
            } catch (SomeException e) {
                // handle exception
                if (++count == maxTries) throw e;
            }
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your license plate number.");
        System.out.println("License plate number: ");

        String plateNo = sc.nextLine();

        Pattern p = Pattern.compile("[A-Z]{3}-[0-9]{4}");

        Matcher m = p.matcher(plateNo);

        boolean match = m.matches();


        if (match) {

            return plateNo ;

        } else {

            System.out.println("Plate Number must be in the form of ABC-1234");
            throw new Exception("InvalidPlateNoFormat");

        }
    }
}