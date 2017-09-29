package com.project1;

import java.io.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.format.DateTimeFormatter;


public class WriteCSV {

    List<Row> rows ;

    public void writeCSV(List<Row> rows) {


        String filenameOut = "src//Out.csv";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
        BufferedWriter writer = null;


        this.rows = rows;

        try {

            writer = new BufferedWriter(new FileWriter(filenameOut));


        } catch (IOException e) {
        }
        try {
            // iterate through the values and build a string out of them
            StringBuilder sb = new StringBuilder();

            //  String newData = sb.toString();
            for (int i = 0; i < rows.size(); i++) {
                sb.append(rows.get(i).getPlate()+";"+rows.get(i).getOwner()+";"+df.format(rows.get(i).getDate())+"\n");
            }


            // get the new string

            //System.out.println(sb.toString());
            writer.write(sb.toString());

            writer.close();

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}