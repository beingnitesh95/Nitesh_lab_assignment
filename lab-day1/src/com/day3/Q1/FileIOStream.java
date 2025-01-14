package com.day3.Q1;
/*
    Download photo of your favourite player and save in some folder in a drive. Now write program to copy each
character from that file and store into another file using
FileReader / FileWriter
FileInputStream / FileOutputStream
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

        public static void main(String[] args) {

            String sourcePath = "C:\\Users\\Nitesh.Yadav\\Desktop\\dhoni.jpg";
            String destinationPath = "C:\\Users\\Nitesh.Yadav\\Desktop\\dhoni_copy.jpg";  // Example: "copy_of_favorite_player_image.jpg"

            try (FileInputStream fis = new FileInputStream(sourcePath);
                 FileOutputStream fos = new FileOutputStream(destinationPath)) {

                int byteData;
                while ((byteData = fis.read()) != -1) {
                    fos.write(byteData);  // Copy each byte from source to destination
                }
                System.out.println("Image copied successfully!");
            } catch (IOException e) {
                System.err.println("Error during file copy: " + e.getMessage());
            }
        }
    }

