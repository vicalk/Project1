package com.project1;

import java.time.LocalDate;

public class Row {

    private String plateNo;

    private int owner;

    private LocalDate date ;

    public Row(String plateNo,int owner,LocalDate date){

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


}
