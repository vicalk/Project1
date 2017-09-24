package com.project1;


import java.util.*;


public class Main {
    public static void main(String[] args) {
        ///////////////////////Database Access//////////////////////////////////////////////////

//      MySQLAccess dao = new MySQLAccess();
//      dao.readDataBase();

       ///////////////////////////   Insert plate in cosole abd check if valid  /////////////////////////////////////////

//      StringForma s = new StringForma();
//      String PlateNo = s.getPlateNo();
//      System.out.println("The licence plate number you inputted is: " + PlateNo) ;


        ///////////////////////////    Insert insurance date expiry in days /////////////////////////////////////

//      InsuranceExpire i = new InsuranceExpire() ;
//      int days = i.getDaysToExpire();
//      System.out.println("Days ti expire are: " + days) ;



        /////////////////////////////    Import CSV (output list of row objects)   /////////////////////////////

//
      ImportCSV im =  new ImportCSV();
      List<Row> rows = im.importCSV();
//
//
      Collections.sort(rows);                 //sorts all the rows ascending (depending on plate number)
//
//
//        for (int i = 0; i < rows.size(); i++) {
//           System.out.println("| " + rows.get(i).getPlate() +" | "+ rows.get(i).getOwner() +" | "+ rows.get(i).getDate() + " |");
//        }
//
//        Collections.sort(rows);
//
//      /////////////////////////////   Write CSV file    /////////////////////////////////////////////
//
//        WriteCSV w =  new WriteCSV();
//        w.writeCSV(rows);
//
//
        InsuranceExpire ch = new InsuranceExpire();
       int days = ch.getDaysToExpire();
        ch.checkplate(days,rows);







    }

    }




