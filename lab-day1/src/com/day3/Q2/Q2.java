package com.day3.Q2;

import java.io.*;

public class Q2 {

        public static void main(String[] args) {
            String sourcePath = "C:\\Users\\Nitesh.Yadav\\Desktop\\dhoni.jpg";
            String destinationPathWithoutBuffer = "C:\\Users\\Nitesh.Yadav\\Desktop\\dhoni_copy_without_buffer.jpg";
            String destinationPathWithBuffer = "C:\\Users\\Nitesh.Yadav\\Desktop\\dhoni_copy_with_buffer.jpg";

            // Measure time and performance improvement without buffering
            long timeWithoutBuffer = measureTime(() -> copyFile(sourcePath, destinationPathWithoutBuffer, false));
            long timeWithBuffer = measureTime(() -> copyFile(sourcePath, destinationPathWithBuffer, true));

            System.out.println("Time without buffering: " + timeWithoutBuffer + " ns");
            System.out.println("Time with buffering: " + timeWithBuffer + " ns");
            System.out.println("Performance improvement: " + ((timeWithoutBuffer - timeWithBuffer) * 100.0 / timeWithoutBuffer) + "%");
        }

        // Method to copy file (with or without buffering)
        private static void copyFile(String sourcePath, String destinationPath, boolean useBuffer) {
            try (InputStream in = useBuffer ? new BufferedInputStream(new FileInputStream(sourcePath))
                    : new FileInputStream(sourcePath);
                 OutputStream out = useBuffer ? new BufferedOutputStream(new FileOutputStream(destinationPath))
                         : new FileOutputStream(destinationPath)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                System.out.println("Image copied successfully" + (useBuffer ? " with buffering." : " without buffering."));
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        // Measure execution time for a file copy operation
        private static long measureTime(Runnable action) {
            long startTime = System.nanoTime();
            action.run();
            return System.nanoTime() - startTime;
        }
    }

