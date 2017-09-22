package com.project1;

import java.time.LocalDate;
import java.util.Arrays;

public class Row implements Comparable<Row> {

    private String plateNo;

    private int owner;

    private LocalDate date ;

    public Row(String plateNo,int owner,LocalDate date){

        super();

        this.plateNo = plateNo;
        this.owner = owner;
        this.date = date ;
    }

    public String getPlate(){
        return plateNo;
    }

    public LocalDate getDate(){
        return date;
    }

    public int getOwner(){
        return owner;
    }

    public int compareTo(Row compareRow) {

        String comparePlateNo = ((Row) compareRow).getPlate();

        //ascending order
        return this.plateNo.compareTo(comparePlateNo);

        //descending order
        //return compareQuantity.this.quantity;

    }


}
