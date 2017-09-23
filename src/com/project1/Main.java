package com.project1;

import java.io.*;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.Integer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
//      MySQLAccess dao = new MySQLAccess();
//      dao.readDataBase();
//      StringForma s = new StringForma();
//      String PlateNo = s.getPlateNo();
//      System.out.println("The licence plate number you inputted is: " + PlateNo) ;
//      InsuranceExpire i = new InsuranceExpire() ;
//      int days = i.getDaysToExpire();
//      System.out.println("Days ti expire are: " + days) ;






//
//
//        System.out.println("| " + "Plate No" +" | "+ "Owner Num" +" | "+ "   Date   " + " |");
//        System.out.println();
//        for (int i = 0; i < rows.size(); i++) {
//            System.out.println("| " + rows.get(i).getPlate() +" | "+ rows.get(i).getOwner() +" | "+ rows.get(i).getDate() + " |");
//        }
///////////////////////////////////////////////        OUTPUT CSV
      ImportCSV im =  new ImportCSV();
      List<Row> rows = im.importCSV();

//        System.out.println(rows.size());
        for (int i = 0; i < rows.size(); i++) {
           System.out.println("| " + rows.get(i).getPlate() +" | "+ rows.get(i).getOwner() +" | "+ rows.get(i).getDate() + " |");
        }



        WriteCSV w =  new WriteCSV();
        w.writeCSV(rows);











    }

    }




