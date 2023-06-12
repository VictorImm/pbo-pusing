/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo6.Tugas2;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Manusia {
    protected String nama;
    // getter
    public String getNama() {
        return this.nama;
    }
    // setter
    public void setNama(String n) {
        this.nama = n;
    }
    
    // constructor
    public Manusia() { }
    public Manusia(String n) {
        this.nama = n;
    }
    
    public void showStatus() {
        System.out.println("Halo, nama saya " + this.nama + "!");
        System.out.println();
    }
}
