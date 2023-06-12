/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo7;

/**
 *
 * @author ASUS
 */
public class PBO7 {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Animal myClass = new Animal();
        }
        catch(Exception e) {
            System.out.println(e);
        }
        
        Ayam a = new Ayam();
        a.speak();
        a.showStatus();
        
    }
    
}
