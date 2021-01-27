/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;
import java.text.DecimalFormat;
/**
 *
 * @author boonc
 */
         
public class P2Q3 {
    /** Converts from inches to centimeters */
    public static double inchToCentimeter(double in){
        double centimeters = 0;
        double inches = in;
        centimeters = inches * 2.54;        
        return centimeters;
    }
    
    /** Converts from centimeters to inches */
    public static double centimeterToInch(double cm){
        double centimeters = cm;
        double inches = 0;
        inches = centimeters / 2.54;
        return inches;
    }

    
    public static void main(String [] args){
        double inches;
        double a = 5.0;
        System.out.println("Inches\tCentimeters\t\tCentimeters\tInches");
        DecimalFormat df = new DecimalFormat("##.##");
        for(double i = 1.0 ; i<=10 ; i++)
        {            
            double in = centimeterToInch(a);
            double centimeters = inchToCentimeter(i);
            System.out.println(i + "\t"+ df.format(centimeters) + 
                    "\t\t\t" + a + "\t\t" + df.format(in));
            a += 5.0;
        }
    }
    
}

