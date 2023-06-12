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
        
public class Kubus extends BangunRuang{
    // properties
    private double sisi;
    
    // constructor
    Kubus(){
        this.sisi = 1;
    }
    Kubus(double s){
        this.sisi = s;
    }
    Kubus(int s){
        this.sisi = (double)s;
    }
    
    // getter and setter
    public void setSisi(double s){
        this.sisi = s;
    }
    
    // volume
    @Override
    public void computeAndSetVolume(){
        this.volume = Math.pow(this.sisi, 3);
    }  
}
