package com.streamProcessing;
import java.util.function.Predicate;

public class Test_Predicate {
        public static void main(String[] args) {

            //  11/5 = false
            Predicate<Integer> predicateEvenNumber = x -> x % 5 == 0;
            System.out.println(predicateEvenNumber.test(11));
            //  Nitesh equal Nitesh = true
            Predicate<String> predicateStringValue = s -> s.contains("Nitesh");
            System.out.println(predicateStringValue.test("Nitesh"));


            Predicate<Employye> maxSalary = e -> e.getSalary() >=60000;
            System.out.println(maxSalary.test(new Employye(1, "Nitesh", 100000)));

            Predicate<Employye> maxSalary1 = e -> e.getSalary() <=60000;
            System.out.println(maxSalary.test(new Employye(1, "Nitesh", 50000)));



        }
    }

