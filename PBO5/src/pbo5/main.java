/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo5;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n==============================");
        Koleksi k = new Koleksi(
                "ini judul koleksi",
                "ini penerbit koleksi",
                1
        );
        k.printString();
        
        System.out.println("\n==============================");
        Majalah m = new Majalah(
                "ini judul majalah", 
                "ini penerbit majalah",
                2, 
                "ini edisi majalah"
        );
        m.printString();
        
        System.out.println("\n==============================");
        Buku b = new Buku(
                "ini judul buku",
                "ini penerbit buku",
                3,
                "ini penulis buku"
        );
        b.printString();
        
        System.out.println("\n==============================");
        Skripsi s = new Skripsi(
                "ini judul skripsi",
                "ini penerbit skripsi",
                4,
                "ini penulis skripsi",
                "ini npm skripsi"
        );
        s.printString();
    }
}
