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

public class Bola extends BangunRuang {
    // properties
    private double radius;
    
    // constructor
    Bola(){
        this.radius = 1;
    }
    Bola(int r){
        this.radius = (double)r;
    }
    Bola(double r){
        this.radius = r;
    }
    
    // getter and setter
    public void setRadius(double r){
        this.radius = r;
    }
    
    // volume
    @Override
    public void computeAndSetVolume(){
        this.volume = (4 * Math.PI * Math.pow(this.radius, 3)) / 3;
    }  
}
