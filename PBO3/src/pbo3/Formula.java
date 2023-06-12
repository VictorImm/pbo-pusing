/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo3;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

import java.util.ArrayList;

public class Formula {
    // properties for constructing formula
    private ArrayList formula = new ArrayList();
    private String[] arrOfFormula;
    
    // properties for transformin formula
    private int now = 0;
    private int max;
    
    // formula setter
    public void setFormula(String f){
        // split each word by space
        this.arrOfFormula = f.split(" ");
        
        // make ArrayList for easier use
        for(String s: this.arrOfFormula){
            this.formula.add(s);
        }
        
        // define max length
        this.max = this.arrOfFormula.length;
        
        // do recursive for transforming formula
        this.formula = createArr();
        
        // reset NOW counter
        this.now = 0;
    }
    
    // formula getter
    public ArrayList getFormula(){
        return this.formula;
    }
    
    // recursive for transforming formula
    private ArrayList createArr(){
        ArrayList arr = new ArrayList();
        
        // control
        while(this.now < this.max){
            switch(this.arrOfFormula[this.now]){
                // if found open bracket
                case "(":
                    this.now ++;
                    arr.add(createArr());
                    break;
                    
                // if found close bracket
                case ")":
                    this.now ++;
                    return arr;
                
                // else
                default:
                    arr.add(this.arrOfFormula[this.now]);
                    this.now ++;
                    break;
            }
        }
        return arr;
    }
}
