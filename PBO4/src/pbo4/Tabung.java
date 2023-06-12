/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo4;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

import java.lang.Math;

public class Tabung extends BangunRuang {
    // properties
    private double radius;
    private double tinggi;
    
    // constructor
    Tabung(){
        this.radius = 1;
        this.tinggi = 1;
    }
    Tabung(int r, int t){
        this.radius = (double)r;
        this.tinggi = (double)t;
    }
    Tabung(double r, double t){
        this.radius = r;
        this.tinggi = t;
    }
    Tabung(double r){
        this.radius = r;
        this.tinggi = 1;
    }
    
    // getter and setter
    public void setRadius(double r){
        this.radius = r;
    }
    public void setTinggi(double t){
        this.tinggi = t;
    }
    
    // volume
    @Override
    public void computeAndSetVolume(){
        this.volume = (Math.PI * (Math.pow(this.radius, 2)) * this.tinggi);
    }  
}
