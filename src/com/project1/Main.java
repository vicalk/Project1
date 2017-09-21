package com.project1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

    String filename = "data.csv";
    File file = new File(filename);

    try {
            Scanner inputsStream = new Scanner(file);
            while (inputsStream.hasNext()){
                String data = inputsStream.next();
                System.out.println(data+**);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
ffhg

    }

}