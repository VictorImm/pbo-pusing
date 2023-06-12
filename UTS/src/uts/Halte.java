/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

import java.util.ArrayList;

public class Halte {
    // property nama kota
    private String kota;
    // getter
    public String getKota() {
        return this.kota;
    }
    
    // property calon penumpang
    private ArrayList<Person> calonPenumpang;
    // getter
    public int getSizeCalonPenumpang() {
        return calonPenumpang.size();
    }
    // setter
    public void setCalonPenumpang(ArrayList<Person> cp) {
        this.calonPenumpang = cp;
    }
    // transfer penumpang
    public ArrayList getCalonPenumpang() {
        return this.calonPenumpang;
    }
    
    // constructor
    Halte(String k, ArrayList<Person> cp) {
        this.kota = k;
        this.calonPenumpang = cp;
    }
}
