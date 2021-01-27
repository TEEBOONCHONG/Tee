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
public class P1Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your credit card number(8-digits): ");
        int num = input.nextInt();
        int num1 = (num / 10000000) * 2;
        int num2 = num / 1000000 % 10;
        int num3 = (num / 100000 % 10) * 2;
        int num4 = num / 10000 % 10;
        int num5 = (num / 1000 % 10) * 2;
        int num6 = num / 100 % 10;
        int num7 = (num / 10 % 10) * 2;
        int num8 = num % 10;

        int even = num2 + num4 + num6 + num8;
        
        System.out.println("The sum of even number is " + even);
        
        int odd1 = num1 / 10;
        int odd2 = num1 % 10;
        int odd3 = num3 / 10;
        int odd4 = num3 % 10;
        int odd5 = num5 / 10;
        int odd6 = num5 % 10;
        int odd7 = num7 / 10;
        int odd8 = num7 % 10;
        
         int odd = odd1 + odd2 + odd3 + odd4 + odd5 + odd6 + odd7 + odd8;
         System.out.println("The sum of odd number is " + odd);

        int total = even + odd;
        
        System.out.println("The total number is " + total);
        if (total % 10 == 0)
        {
            System.out.println("The credit card is valid");
        }
        else
            System.out.println("The credit card is invalid");
    }
    
}
