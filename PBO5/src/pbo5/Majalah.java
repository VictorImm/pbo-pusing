/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Majalah extends Koleksi {
    private String edisi;
    // getter
    public String getEdisi() {
        return this.edisi;
    }
    // setter
    public void setEdisi(String e) {
        this.edisi = e;
    }
    
    // constructor
    Majalah() {
        super();
    }
    Majalah(String j, String p, int t, String e) {
        // super constructor
        super(j, p, t);
        
        this.edisi = e;
    }
    
    // print out
    public void printString() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Penerbit : " + this.penerbit);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("Edisi : " + this.edisi);
    }
}
