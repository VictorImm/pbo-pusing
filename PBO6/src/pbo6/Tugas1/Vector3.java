/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo6.Tugas1;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Vector3 {
    // properties
    private int[] vector = new int[3];
    
    // constructor
    public Vector3(int[] v) {
        this.vector = v;
    }
    
    // method
    public int[] product(int c) {
        int[] res = new int[3];
        for(int i=0; i<3; i++) {
            res[i] = this.vector[i] * c;
        }
        
        return res;
    }
    public int product(int[] v) {
        int res = 0;
        for(int i=0; i<3; i++) {
            res += (this.vector[i] * v[i]);
        }
        
        return res;
    }
}
