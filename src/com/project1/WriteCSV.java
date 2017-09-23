//package com.project1;
//
//
//import java.io.*;
//import java.util.*;
//
//
//public class WriteCSV{
//
//
//private static void writeCSV()
//        {
//            String filename = "src//Out.csv";
//
//            File file = new File(filename);
//
//            BufferedWriter writer = null;
//
//            try {
//
//                writer = new BufferedWriter(new FileWriter(filename));
//
//
//            } catch (IOException e) {
//            }
//            try {
//
//                    // iterate through the values and build a string out of them
//                    StringBuilder sb = new StringBuilder();
//
//                    //  String newData = sb.toString();
//                    for (int i = 0; i < values.length; i++) {
//                        sb.append(values[i]);
//                        if (i < values.length - 1) {
//                            sb.append(";");
//
//
//                        }
//
//                    }
//                    // get the new string
//
//                    System.out.println(sb.toString());
//                    writer.write(sb.toString()+"\n");
//                }
//                writer.close();
//                inputStream.close();
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//
//        }
//}
//        }