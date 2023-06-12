/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo6;

import pbo6.Tugas1.Vector3;
import pbo6.Tugas2.Manusia;
import pbo6.Tugas2.Siswa;
import pbo6.Tugas2.KelompokBelajar;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class main {
    public static void main(String[] args) {
        // TUGAS 1
        System.out.println("Tugas 1");
        int[] arr = {2, 3, 4};
        Vector3 v = new Vector3(arr);
        
        int[] res = v.product(10);
        System.out.println("=== Dot Product ===");
        System.out.print("[");
        for(int i: res) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        
        int[] arr2 = {9, 8, 7};
        System.out.println("\n=== Cross Product ===");
        System.out.println(v.product(arr2));
        
        // TUGAS 2
        System.out.println("\n\nTugas 2");
        System.out.println("=== Class Manusia ===");
        Manusia m = new Manusia(
                "Budi"
        );
        m.showStatus();
        
        System.out.println("=== Class Siswa ===");
        Siswa s = new Siswa(
                "Siti", 
                "SMP 1 Surabaya"
        );
        s.showStatus();
      
        System.out.println("=== Class KelompokBelajar ===");
        KelompokBelajar kb = new KelompokBelajar(
                "Toni", 
                "SMA 5 Surabaya", 
                10
        );
        kb.showStatus();
    }
    
}
