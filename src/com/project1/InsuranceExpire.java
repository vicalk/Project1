package com.project1;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class InsuranceExpire {

    List<Row> rows ;

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
    public void checkplate(int days,List<Row> rows) {

        this.rows = rows ;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate expireDate = LocalDate.now().plusDays(days);


        for (int i = 0; i < rows.size(); i++) {
            if(rows.get(i).getDate().isBefore(expireDate)){

                System.out.println(rows.get(i).getPlate()+"  "+rows.get(i).getOwner());
            }
        }



        //System.out.println(dtf.format(now));

    }


}
