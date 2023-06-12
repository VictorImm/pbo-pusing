/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo3;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

import java.util.Scanner;

public class main{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String input;

        System.out.println("Masukkan formula dipisah dengan spasi :");
        System.out.print(">> ");
        input = scan.nextLine();
        
        Formula formula = new Formula();
        formula.setFormula(input);
        
        Calculator c = new Calculator();
        
        System.out.println(c.Calculate(formula.getFormula()));
    }
    
}
