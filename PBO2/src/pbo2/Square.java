/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Square{
    // sides
    private int lengthOfSide;
    
    public int getLength(){
        return this.lengthOfSide;
    }
    public void setLength(int s){
        this.lengthOfSide = s;
    }
    
    // constructor
    Square(){
        this.lengthOfSide = 0;
    }
    Square(int s){
        this.lengthOfSide = s;
    }
    
    // area
    private int area;
    public int getArea(){
        return this.area;
    }
    void calculateArea(){
        this.area = (this.lengthOfSide * this.lengthOfSide);
    }
    
    // perimeter
    private int perimeter;
    public int getPerimeter(){
        return this.perimeter;
    }
    void calculatePerimeter(){
        this.perimeter = (4 * this.lengthOfSide);
    }
}