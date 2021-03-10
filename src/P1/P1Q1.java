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
public class P1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.print("\n");
        
        System.out.print("Enter your year of study: ");
        int year = input.nextInt();
        
        System.out.print("\n");
        
        System.out.print("aWhat is your target GPA for this semester? ");
        double target = input.nextDouble();
        
        System.out.print("\n");
        
        System.out.println("Welcome " + name);
        System.out.println("Work hard to achieve your target GPA of " + target + " this semester of your Year " + year); 
    }
    
}
