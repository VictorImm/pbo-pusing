/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo6.Tugas2;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Siswa extends Manusia {
    protected String sekolah;
    // getter
    public String getSekolah() {
        return this.sekolah;
    }
    // setter
    public void setSekolah(String s) {
        this.sekolah = s;
    }
    
    // constructor
    public Siswa(){ super(); }
    public Siswa(String n, String s) {
        super(n);
        this.sekolah = s;
    }
    
    // override
    @Override
    public void showStatus() {
        System.out.println("Halo, nama saya " + this.nama + "!");
        System.out.println("Saya bersekolah di " + this.sekolah);
        System.out.println();
    }
}
