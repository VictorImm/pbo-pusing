/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class Rectangle {
    // width
    private int width;
    public int getWidth(){
        return this.width;
    }
    public void setWidth(int w){
        this.width = w;
    } 
    
    // height
    private int height;
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int h){
        this.height = h;
    }
    
    // constructor
    Rectangle(){
        this.width = 0;
        this.height = 0;
    }
    Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }
    
    // area
    private int area;
    public int getArea(){
        return this.area;
    }
    void calculateArea(){
        this.area = (this.width * this.height);
    }
    
    // perimeter
    private int perimeter;
    public int getPerimeter(){
        return this.perimeter;
    }
    void calculatePerimeter(){
        this.perimeter = 2*(this.width + this.height);
    }
}
