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


        String filename = "src//VehiclesData.csv";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
        File file = new File(filename);
        List<Row> rows = new ArrayList<>();
        int count = 1;

        try {
            Scanner inputsStream = new Scanner(file);
            while (inputsStream.hasNext()) {

                String data = inputsStream.next();
                String[] values = data.split(";");
                String plates = values[0];

                int owner = Integer.parseInt(values[1], 10);

                LocalDate date = LocalDate.parse(values[2], df);

                Row row = new Row(plates, owner, date);

                rows.add(row);

//                System.out.println(count + "  " + plates + "  " + owner + "  " + date);
                count++;


            }
        } catch (FileNotFoundException fe) {
            System.err.println("Invalid file path!");

        } catch (Exception e) {
            System.err.println("Invalid CSV format at line " + count + "!");

        }


        Collections.sort(rows);



//          //list.sort();
//        Row row1 = (Row)list.get(1); // explicit cast
//        System.out.println(row1.getPlate());

        System.out.println("| " + "Plate No" +" | "+ "Owner Num" +" | "+ "   Date   " + " |");
        System.out.println();
        for (int i = 0; i < rows.size(); i++) {
            System.out.println("| " + rows.get(i).getPlate() +" | "+ rows.get(i).getOwner() +" | "+ rows.get(i).getDate() + " |");
        }
///////////////////////////////////////////////
        String filenameOut = "src//Out.csv";

        BufferedWriter writer = null;

        File fileout = new File(filenameOut);
        try {

            writer = new BufferedWriter(new FileWriter(filenameOut));


        } catch (IOException e) {
        }
        try {
            // iterate through the values and build a string out of them
            StringBuilder sb = new StringBuilder();

            //  String newData = sb.toString();
            for (int i = 0; i < rows.size(); i++) {
                sb.append(rows.get(i).getPlate()+";"+rows.get(i).getOwner()+";"+rows.get(i).getDate()+"\n");}


            // get the new string

            System.out.println(sb.toString());
            writer.write(sb.toString());
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
//        writer.close();
//        inputStream.close();
    }







    }




