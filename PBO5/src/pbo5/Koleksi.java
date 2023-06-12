/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo5;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Koleksi {
    protected String judul;
    // getter
    public String getJudul() {
        return this.judul;
    }
    // setter
    public void setJudul(String j) {
        this.judul = j;
    }
    
    protected String penerbit;
    // getter
    public String getPenerbit() {
        return this.penerbit;
    }
    // setter
    public void setPenerbit(String p) {
        this.penerbit = p;
    }
    
    protected int tahun;
    // getter
    public int getTahun() {
        return this.tahun;
    }
    // setter
    public void setTahun(int t) {
        this.tahun = t;
    }
    
    // constructor
    Koleksi() { }
    Koleksi(String j, String p, int t) {
        this.judul = j;
        this.penerbit = p;
        this.tahun = t;
    }
    
    // print out
    public void printString() {
        System.out.println("Judul : " + this.judul);
        System.out.println("Penerbit : " + this.penerbit);
        System.out.println("Tahun : " + this.tahun);
    }
}
