/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Skripsi extends Buku {
    private String NPM;
    // getter
    public String getNPM() {
        return this.NPM;
    }
    // setter
    public void setNPM(String npm) {
        this.NPM = npm;
    }
    
    // constructor
    Skripsi() {
        super();
    }
    Skripsi(String j, String pbit, int t, String plis, String npm) {
        // super constructor
        super(j, pbit, t, plis);
        
        this.NPM = npm;
    }
    
    // print out
    public void printString() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Penerbit : " + this.penerbit);
        System.out.println("Tahun : " + this.tahun);
        System.out.println("Penulis : " + this.penulis);
        System.out.println("NPM : " + this.NPM);
    }
}
