/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo4;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Balok extends BangunRuang {
    // properties
    private double panjang;
    private double lebar;
    private double tinggi;
    
    // constructor
    Balok(){
        this.panjang = 1;
        this.lebar = 2;
        this.tinggi = 1;
    }
    Balok(int p, int l, int t){
        this.panjang = (double)p;
        this.lebar = (double)l;
        this.tinggi = (double)t;
    }
    Balok(double p, double l, double t){
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }
    Balok(double p){
        this.panjang = p;
        this.lebar = 1;
        this.tinggi = 1;
    }
    
    // getter and setter
    public void setPanjang(double p){
        this.panjang = p;
    }
    public void setLebar(double l){
        this.lebar = l;
    }
    public void setTinggi(double t){
        this.tinggi = t;
    }
    
    // volume
    @Override
    public void computeAndSetVolume(){
        this.volume = this.panjang * this.lebar * this.tinggi;
    }
}
