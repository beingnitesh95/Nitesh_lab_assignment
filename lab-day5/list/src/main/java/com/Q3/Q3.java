/*
Q3. Consider file data:
97.59780253225763
23.705044359023198
72.97025259152822
18.986484094410137
77.56528079180427
88.5456385076513
59.09494795452861
72.71304984780839
80.0202893029642
29.58427968260707
74.66713563267237
27.40345943374961
15.990164966686493
58.852582668688534
45.58743329596889
77.2227556103568
53.49035808405568
93.5583604428736
35.09314691785803
9.812059847790467
51.438605600928376
6.081908597641594
2.604194278086147
99.43752090812772
20.355993598952395
Put data into a file named data.txt, Read from data.txt all the doubles (edited by a user) and display the biggest one.
 */

package com.Q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q3 {
        public static void main(String[] args) {
            double largest = Double.MIN_VALUE;  // Start with the smallest possible double value

            try (BufferedReader reader = new BufferedReader(new FileReader("C:\\SE\\lab-day5\\list\\src\\main\\resources\\Data.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    try {
                        double value = Double.parseDouble(line.trim());  // Convert the string to double
                        if (value > largest) {
                            largest = value;  // Update largest if current value is greater
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping invalid data: " + line);
                    }
                }
                System.out.println("The largest number in the file is: " + largest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

