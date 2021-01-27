/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practical2;
import java.util.Formatter;
/**
 *
 * @author boonc
 */
public class P2Q1 {
    public static void main(String[] args) {
        System.out.println("Number\t\tSquareRoot");
        for (int i=0; i <=20; i++)
        {
            double x = Math.sqrt(i);
            System.out.printf(i + "\t\t %.4f %n", x);
            i +=1;
        }
    }
}
