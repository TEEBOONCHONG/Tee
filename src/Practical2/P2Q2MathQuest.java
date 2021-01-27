/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;
import java.util.Scanner;
/**
 *
 * @author boonc
 */
public class P2Q2MathQuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        double lower = 1;
        if (num > 1)
        {
            double upper = num;
            System.out.println("Lower limit : " + lower);
            System.out.println("Upper limit : " + upper);
            double midp = ((1 + num) /2)^2;
            if (midp > num)
            {
                upper = midp;
            }
            else if (midp < num)
            {
                lower = midp;
            }
            
        }
        
    }
    
}
