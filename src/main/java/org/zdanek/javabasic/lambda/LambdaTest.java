package org.zdanek.javabasic.lambda;

import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

/**
 * Program demonstrujący sposób użycia wyrażeń lambda.
 * @version 1.0 2015-05-12
 * @author Cay Horstmann
 */
public class LambdaTest
{
   public static void main(String[] args)
   {
      String[] planets = new String[] { "Merkury", "Wenus", "Ziemia", "Mars", 
            "Jowisz", "Saturn", "Uranu", "Neptun" };
      System.out.println(Arrays.toString(planets));
      System.out.println("Sortowanie alfabetyczne:");
      Arrays.sort(planets);
      System.out.println(Arrays.toString(planets));
      System.out.println("Sortowanie wg długości:");
      Arrays.sort(planets, (first, second) -> first.length() - second.length());
      System.out.println(Arrays.toString(planets));
            
      Timer t = new Timer(1000, event ->
         System.out.println("Jest godzina " + new Date()));
      t.start();   
         
      // utrzymuje program w działaniu, aż użytkownik kliknie przycisk Ok
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);         
   }
}
