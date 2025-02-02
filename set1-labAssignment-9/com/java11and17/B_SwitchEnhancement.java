package com.java11and17;

public class B_SwitchEnhancement {
        public static void main(String[] args) {
            // Define an enum for the days of the week
            enum WeekDay {
                MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
            }

            // Set the day to TUESDAY
            WeekDay day = WeekDay.TUESDAY;

            // Using the enhanced switch expression (Java 12+)
            String result = switch (day) {
                case MONDAY, WEDNESDAY, FRIDAY -> "Let's meet!";
                case TUESDAY, THURSDAY, SATURDAY -> "No meeting!";
                case SUNDAY -> "Let's meet (although Sunday should be a free day, man!)!";
                default -> "Do I really need this?!";
            };

            // Output the result
            System.out.println(result);  // For WeekDay.TUESDAY, the output will be: No meeting!
        }

}
