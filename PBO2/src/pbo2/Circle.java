/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Circle {
    final double PI = 3.14;
    
    // radius
    private int radius;
    
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }
    
    // constructor
    Circle(){
        this.radius = 0;
    }
    Circle(int r){
        this.radius = r;
    }
    
    // area
    private double area;
    public double getArea(){
        return this.area;
    }
    void calculateArea(){
        this.area = this.PI * (this.radius * this.radius);
    }
    
    // perimeter
    private double perimeter;
    public double getPerimeter(){
        return this.perimeter;
    }
    void calculatePerimeter(){
        this.perimeter = 2 * PI * this.radius;
    }
}
