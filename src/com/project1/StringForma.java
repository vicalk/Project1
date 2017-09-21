package com.project1;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringForma {


    public  String getPlateNo()  {


        boolean match ;
        String retVal ;

        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("[A-Z]{3}-[0-9]{4}");

        do {

                System.out.println("Please enter your license plate number.");
                System.out.println("(Plate Number must be in the form of 'ABC-1234')");
                System.out.println("License plate number: ");

                String plateNo = sc.nextLine();

                Matcher m = p.matcher(plateNo);

                match = m.matches();

                if (match) {
                    retVal = plateNo; }

                else {

                    System.err.println("Error:Invalid Plate Number!");
                    retVal = null;

                }

        } while (match==false);

        return retVal ;

    }
}