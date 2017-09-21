package com.project1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Integer;

public class Main {
    public static void main(String[] args){
//      MySQLAccess dao = new MySQLAccess();
//      dao.readDataBase();
//      StringForma s = new StringForma();
//      String PlateNo = s.getPlateNo();
//      System.out.println("The licence plate number you inputted is: " + PlateNo) ;
//      InsuranceExpire i = new InsuranceExpire() ;
//      int days = i.getDaysToExpire();
//      System.out.println("Days ti expire are: " + days) ;

    String filename = "src/VehiclesData.csv";
    File file = new File(filename);
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    try {
            Scanner inputsStream = new Scanner(file);
            while (inputsStream.hasNext()){
                String data = inputsStream.next();
                String[] values=data.split(";");
                String plates = values[0];

                int owner =  Integer.parseInt(values[1],10);

                String date = values[2];

                if (date.charAt(1) == '/') date = "0" + date;
                if (date.charAt(4) == '/') date = date.substring(0,3) + "0" + date.substring(3);


                try {
                    Date dates = df.parse(date);
                } catch (ParseException e) {
                    e.printStackTrace();
                }


                System.out.println(date);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}