package org.zdanek.java8.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda {


    //klasyczy Comparator
    Comparator<String> comparator = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(),s2.length());
        }
    };

    //Lambda expression
    Comparator<String> comparator2 = (String s1, String s2) -> Integer.compare(s1.length(),s2.length());

    Comparator<String> comparator3 = (s1, s2) -> Integer.compare(s1.length(),s2.length());



    //klasyczna implementacja interface Runnable
    Runnable r= new Runnable() {
        @Override
        public void run() {
            int i =0;
            while (i++<10){
                System.out.println("It works!");
            }
        }
    };

    //Lambda expression
    Runnable r2= () ->{
        int i =0;
        while (i++<10){
            System.out.println("It works!");
        }
    };




}
