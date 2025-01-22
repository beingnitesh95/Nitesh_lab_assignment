package com.q2;

public class Student {
        private int id;
        private String name;
        private int marks;

        // Constructor
        public Student(int id, String name, int marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }


        // Override toString() for better output
        @Override
        public String toString() {
            return "Student{id=" + id + "," +
                    " name='" + name + "'," +
                    " marks=" + marks + "}";
        }
    }

