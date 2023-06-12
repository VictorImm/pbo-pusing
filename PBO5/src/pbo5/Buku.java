/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Buku extends Koleksi {
    protected String penulis;
    // getter
    public String getPenulis() {
        return this.penulis;
    }
    // setter
    public void setPenulis(String p) {
        this.penulis = p;
    }
    
    // constructor
    Buku() {
        super();
    }
    Buku(String j, String pbit, int t, String plis) {
        super(j, pbit, t);
        
        this.penulis = plis;
    }
    
    // print out
    public void printString() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Penerbit : " + this.penerbit);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("Penulis : " + this.penulis);
    }
    
}
