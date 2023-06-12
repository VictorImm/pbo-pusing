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

public class Calculator {    
    private double Convert(Object s){
        Double d;
        
        try{
            d = Double.valueOf((String)s);
        }
        catch(Exception e){
            d = Double.valueOf((Double)s);
        }
        
        return d;
    }
    
    public double Calculate(ArrayList arr){        
        return Recursive(arr);
    }
    
    private double x;
    private double Recursive(ArrayList arr){
        double res = 0;
        
        // check for bracket
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) instanceof ArrayList){
                arr.set(i, Recursive((ArrayList)arr.get(i)));
            }
        }
        
        // calculate * and /
        for(int i=1; i<arr.size(); i++){
            if((arr.get(i).equals("*")) || (arr.get(i).equals("/"))){
                if(arr.get(i).equals("*")){
                    this.x = Convert(arr.get(i-1)) * Convert(arr.get(i+1));
                }
                else if(arr.get(i).equals("/")){
                    this.x = Convert(arr.get(i-1)) / Convert(arr.get(i+1));
                }
                arr.set(i-1, this.x);
                arr.remove(i);
                arr.remove(i);
                i--;
            }
        }
        
        // calculate + and -
        for(int i=1; i<arr.size(); i++){
            if((arr.get(i).equals("+")) || (arr.get(i).equals("-"))){
                if(arr.get(i).equals("+")){
                    this.x = Convert(arr.get(i-1)) + Convert(arr.get(i+1));
                }
                else if(arr.get(i).equals("-")){
                    this.x = Convert(arr.get(i-1)) - Convert(arr.get(i+1));
                }
                arr.set(i-1, this.x);
                arr.remove(i);
                arr.remove(i);
                i--;
            }
        }
        
        res = Convert(arr.get(0));
        return res;
    }
}
