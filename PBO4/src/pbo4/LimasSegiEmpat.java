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

public class LimasSegiEmpat extends BangunRuang {
    // properties
    private double sisi;
    private double tinggi;
    
    // constructor
    LimasSegiEmpat(){
        this.sisi = 1;
        this.tinggi = 1;
    }
    LimasSegiEmpat(int s, int t){
        this.sisi = (double)s;
        this.tinggi = (double)t;
    }
    LimasSegiEmpat(double s, double t){
        this.sisi = s;
        this.tinggi = t;
    }
    LimasSegiEmpat(double s){
        this.sisi = s;
        this.tinggi = 1;
    }
    
    // getter and setter
    public void setSisi(double s){
        this.sisi = s;
    }
    public void setTinggi(double t){
        this.tinggi = t;
    }
    
    // volume
    @Override
    public void computeAndSetVolume(){
        this.volume = (Math.pow(this.sisi, 2) * this.tinggi) / 3;
    }  
}
