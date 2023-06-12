/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author ASUS
 */
public class Classifier { 
    int calculateGaji(int pengalaman, int skill, int dept){
        int g = 0;
        
        switch(pengalaman){
            case 1:
                g += 500000;
                break;
            case 2:
                g += 1000000;
                break;
            case 3:
                g += 2000000;
                break;
            default:
                break;
        }
        
        switch(skill){
            case 1:
                g += 1000000;
                break;
            case 2:
                g += 2000000;
                break;
            case 3:
                g += 2500000;
                break;
            default:
                break;
        }

        switch(dept){
            case 1:
                g += 8000000;
                break;
            case 2:
                g += 5000000;
                break;
            case 3:
                g += 4000000;
                break;
            default:
                break;
        }
    
        return g;
    }

    void insertGaji(int gaji, Person p){
        p.setGaji(p.getGaji() + gaji);
    }
}