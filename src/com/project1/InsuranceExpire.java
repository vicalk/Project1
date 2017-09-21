package com.project1;

import java.util.Scanner;

public class InsuranceExpire {

    public  int getDaysToExpire()  {


        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Please enter days to insurance expiry.");
                System.out.println("(Days to insurance expiry must be between 0 to 999)");
                System.out.println("Days to insurance expiry: ");

                int days = sc.nextInt();

                if (days>=0 && days<=999){

                    return days;}

            } catch (Exception e) {

                System.err.println("Error invalid input!");
                sc.next();

            }
        }

    }


}
