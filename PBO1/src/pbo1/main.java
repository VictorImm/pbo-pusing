/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gaji;
        Person p = new Person();
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        
        System.out.print("Masukkan nama : ");
        String nama = myObj.nextLine();  // Read user input
        p.setNama(nama);
        
        System.out.print("Masukkan alamat : ");
        String almt = myObj.nextLine();  // Read user input
        p.setAlamat(almt);
        
        System.out.println("Pilih pengalaman : ");
        System.out.println("1. Pemula");
        System.out.println("2. Menengah");
        System.out.println("3. Expert");
        System.out.print(">> ");
        int pengalaman = myObj.nextInt();  // Read user input
        
        System.out.println("Pilih skill : ");
        System.out.println("1. Web");
        System.out.println("2. Mobile");
        System.out.println("3. Desktop");
        System.out.print(">> ");
        int skill = myObj.nextInt();  // Read user input
        
        System.out.println("Pilih departemen : ");
        System.out.println("1. IT");
        System.out.println("2. HRD");
        System.out.println("3. Finance");
        System.out.print(">> ");
        int dept = myObj.nextInt();  // Read user input
        
        Classifier c = new Classifier();
        gaji = c.calculateGaji(pengalaman, skill, dept);
        c.insertGaji(gaji, p);
        
        p.showProp();
    }
}