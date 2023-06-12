/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo6.Tugas2;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class KelompokBelajar extends Siswa {
    private int noKelompok;
    // getter
    public int getNoKelompok() {
        return this.noKelompok;
    }
    // setter
    public void setNoKelompok(int nk) {
        this.noKelompok = nk;
    }
    
    // constructor
    public KelompokBelajar() { super(); }
    public KelompokBelajar(String n, String s, int nk) {
        super(n, s);
        this.noKelompok = nk;
    }
    
    // override
    @Override
    public void showStatus() {
        System.out.println("Halo, nama saya " + this.nama + "!");
        System.out.println("Saya bersekolah di " + this.sekolah);
        System.out.println("Saya berada di kelompok belajar " + this.noKelompok);
        System.out.println();
    }
}
