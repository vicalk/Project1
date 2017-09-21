package com.project1;


public class Main {
    public static void main(String[] args) throws Exception {
        //MySQLAccess dao = new MySQLAccess();
        //dao.readDataBase();
        StringForma s = new StringForma();
        String PlateNo = s.getPlateNo();
        System.out.println("The licence plate number you inputted is: " + PlateNo) ;
    }

}