/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P1;
import java.util.Scanner;
/**
 *
 * @author boonc
 */
public class P1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age(years): ");
        int age = input.nextInt();
        int days = age * 365 ;
        int seconds = age * 365 * 24 * 60 * 60 ;
        
        System.out.println("Age in years: " + age + " years");
        
        System.out.println("Age in days: " + days + " days");
        
        System.out.println("Age in seconds: " + seconds + " seconds\n");
        
        System.out.print("Process completed");
        
    }
    
    
}
