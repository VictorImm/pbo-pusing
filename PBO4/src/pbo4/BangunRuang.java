/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo4;


/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public abstract class BangunRuang {
    protected double volume;
    
    abstract void computeAndSetVolume();
    public double getVolume(){
        return this.volume;
    }
}
