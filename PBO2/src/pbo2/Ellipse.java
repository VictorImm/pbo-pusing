/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

import java.lang.Math;

public class Ellipse {
    final double PI = 3.14;
    
    // semi major axis
    private int semiMajorAxis;
    public int getSMaA(){
        return this.semiMajorAxis;
    }
    public void setSMaA(int SMaA){
        this.semiMajorAxis = SMaA;
    }
    
    // semi minor axis
    private int semiMinorAxis;
    public int getSMiA(){
        return this.semiMinorAxis;
    }
    public void setSMiA(int SMiA){
        this.semiMinorAxis = SMiA;
    }
    
    // constructor
    Ellipse(){
        this.semiMajorAxis = 0;
        this.semiMinorAxis = 0;
    }
    Ellipse(int SMaA, int SMiA){
        this.semiMajorAxis = SMaA;
        this.semiMinorAxis = SMiA;
    }
    
    // area
    private double area;
    public double getArea(){
        return this.area;
    }
    void calculateArea(){
        this.area = this.PI * this.semiMajorAxis * this.semiMinorAxis;
    }
    
    // perimeter
    private double perimeter;
    public double getPerimeter(){
        return this.perimeter;
    }
    void calculatePerimeter(){
        double temp = (Math.pow(this.semiMajorAxis, 2) + Math.pow(this.semiMinorAxis, 2))/2;
        this.perimeter = 2 * this.PI * (Math.sqrt(temp));
    }
}
