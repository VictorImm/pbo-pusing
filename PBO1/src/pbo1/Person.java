/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo1;

/**
 *
 * @author ASUS
 */
public class Person {
    private String nama;
    public void setNama(String n) {
        this.nama = n;
    }
    
    private String alamat;
    public void setAlamat(String a) {
        this.alamat = a;
    }
    
    private int gaji;
    Person(){
        gaji = 0;
    }
    
    public int getGaji() {
        return gaji;
    }
    
    public void setGaji(int g) {
        this.gaji = g;
    }
    
    void showProp(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Alamat : " + this.alamat);
        System.out.println("Gaji : " + this.gaji);
    }
}
