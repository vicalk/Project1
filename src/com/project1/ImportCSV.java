package com.project1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.lang.Integer;


public class ImportCSV {

    public List<Row> importCSV() {


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

                count++;
            }

            inputsStream.close();
            return rows;

        } catch (FileNotFoundException fe) {
            System.err.println("Invalid file path!");
            return null;

        } catch (Exception e) {
            System.err.println("Invalid CSV format at line " + count + "!");
            return rows;

        }
    }
}