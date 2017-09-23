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


public class WriteCSV {

    List<Row> rows ;

    public void writeCSV(List<Row> rows) {

        String filenameOut = "src//Out.csv";

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
                sb.append(rows.get(i).getPlate()+";"+rows.get(i).getOwner()+";"+rows.get(i).getDate()+"\n");
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