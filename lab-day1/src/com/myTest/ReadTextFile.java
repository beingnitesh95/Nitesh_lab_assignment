package com.myTest;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadTextFile {
        public static void main(String[] args) {

            try{
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Nitesh.Yadav\\Downloads\\new2.json"));
                String line = null;
                while ((line=br.readLine())!=null){
                    System.out.printf(line);
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }



        }
    }
