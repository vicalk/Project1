package com.project1;

import java.util.Scanner;

public class InsuranceExpire {

    public  int getDaysToExpire() throws Exception {


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

        System.out.println("Please enter days to insurance expiry.");
        System.out.println("Days to insurance expiry: ");

        int days = sc.nextInt();

        if (days>=0 && days<=999){

            return days;

        } else {

            System.out.println("Days to insurance expiry must be between 0 to 999");
            throw new Exception("InvalidDaysToExpire");

        }
    }


}
