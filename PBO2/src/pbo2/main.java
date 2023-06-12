/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

import java.util.Scanner;

public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        // Persegi
        Square s = new Square();
        
        System.out.println("===Persegi===");
        System.out.print("Masukkan panjang sisi : ");
        s.setLength(scan.nextInt());
        
        s.calculateArea();
        s.calculatePerimeter();
        
        System.out.println("Sisi : " + s.getLength());
        System.out.println("Luas : " + s.getArea());
        System.out.println("Keliling : " + s.getPerimeter());
        
        
        // Persegi panjang
        Rectangle r = new Rectangle(10, 15);    
        
        System.out.println("\n\n===Persegi Panjang===");
        System.out.print("Masukkan sisi lebar : ");
        r.setWidth(scan.nextInt());
        System.out.print("Masukkan sisi panjang : ");
        r.setHeight(scan.nextInt());
        
        r.calculateArea();
        r.calculatePerimeter();
        
        System.out.println("Lebar : " + r.getWidth());
        System.out.println("Tinggi : " + r.getHeight());
        System.out.println("Luas : " + r.getArea());
        System.out.println("Keliling : " + r.getPerimeter());
        
        
        // Circle
        Circle c = new Circle();     

        System.out.println("\n\n===Lingkaran===");        
        System.out.print("Masukkan jari-jari : ");
        c.setRadius(scan.nextInt());

        c.calculateArea();
        c.calculatePerimeter();
        
        System.out.println("Jari-jari : " + c.getRadius());
        System.out.println("Luas : " + c.getArea());
        System.out.println("Keliling : " + c.getPerimeter());
        
        
        // Ellipse
        Ellipse e = new Ellipse();     
        
        System.out.println("\n\n===Ellipse===");
        System.out.print("Masukkan Semi major axis : ");
        e.setSMaA(scan.nextInt());
        System.out.print("Masukkan Semi minor axis : ");
        e.setSMiA(scan.nextInt());
        
        e.calculateArea();
        e.calculatePerimeter();
        
        System.out.println("Semi major axis : " + e.getSMaA());
        System.out.println("Semi minor axis : " + e.getSMiA());
        System.out.println("Luas : " + e.getArea());
        System.out.println("Keliling : " + e.getPerimeter());
    }
    
}
