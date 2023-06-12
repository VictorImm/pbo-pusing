/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

import java.util.ArrayList;

public class Bus {
    // property penumpang di dalam bus
    private ArrayList<Person> penumpang;
    // getter
    private int getPenumpang() {
        return this.penumpang.size();
    }
    // setter
    private void setPenumpang(ArrayList<Person> p, String t){
        // buat variable sementara untuk menampung
        // penumpang yang sesuai dan tidak sesuai
        ArrayList<Person> tempNaik = new ArrayList();
        ArrayList<Person> tempTidakJadi = new ArrayList(p);
        
        // program sederhana untuk mengecek penumpang
        // apakah penumpang yang akan diangkut memiliki tujuan yang sama
        // dengan bus?
        // jika memang memiliki tujuan yang sama, makan akan diangkut
        for(Person each: p){            
            for(Halte halte: this.tujuan){
                if((each.getTujuan()).equals(halte.getKota())){
                    tempNaik.add(each);
                    tempTidakJadi.remove(each);
                    break;
                }
            }
        }
        
        // cek apakah penumpang dengan tujuan yang sama melebihi kapasitas
        // atau tidak
        if (this.penumpang.size() + tempNaik.size() >= 20) {
            System.out.println("!!! Penumpang lebih dari kapasitas !!!");
        }else {
            // tambahkan penumpang ke dalam bus
            System.out.println("   - " + tempNaik.size() + " penumpang Naik");
            for(Person each: tempNaik) {
                System.out.println("      - Tujuan : " + each.getTujuan());
            }
            this.penumpang.addAll(tempNaik);
            
            // kembalikan ke halte jika ada orang yang tidak sesuai
            for(Halte halte: this.tujuan){
                if((halte.getKota()).equals(t)){
                    halte.setCalonPenumpang(tempTidakJadi);
                    break;
                }
            }
        }
    }
    //
    
    // property tujuan bus
    private ArrayList<Halte> tujuan;
    public ArrayList getTujuan() {
        return this.tujuan;
    }
     // constructor
    Bus(ArrayList<Person> p, ArrayList<Halte> t) {
        System.out.println("-> Bus berangkat dari PULL/Kantor");
        this.penumpang = p;
        this.tujuan = t;
    }
    Bus(ArrayList<Halte> t) {
        System.out.println("-> Bus berangkat dari PULL/Kantor");
        this.tujuan = t;
    }
    Bus() {
        System.out.println("-> Bus berangkat dari PULL/Kantor");
    }
    
    // method dari bus
    public void run() {
        System.out.println("   - Jumlah penumpang: " + getPenumpang() + " Penumpang");
        for(Person each: this.penumpang) {
            System.out.println("      - Tujuan : " + each.getTujuan());
        }
        
        int count = 0;
        while(tujuan.size() > count){
            Halte halte = this.tujuan.get(0);
            System.out.println("------------------------------");
            // print jumlah orang yang menunggu
            System.out.println("-> Halte " + halte.getKota() + ": " + halte.getSizeCalonPenumpang() + " orang menunggu");
            System.out.println("-> Bus sampai di kota " + halte.getKota());
            
            // penumpang turun
            ArrayList<Person> tempTurun = new ArrayList();
            ArrayList<Person> tempTetap = new ArrayList();
            for(Person each: this.penumpang){
                if((each.getTujuan()) == (halte.getKota())){
                    tempTurun.add(each);
                }else {
                    tempTetap.add(each);
                }
            }
            this.penumpang = tempTetap;
            System.out.println("   - " + tempTurun.size() + " penumpang turun");
            
            // penumpang naik
            setPenumpang(halte.getCalonPenumpang(), halte.getKota());
            
            System.out.println("   - Jumlah penumpang: " + getPenumpang() + " Penumpang");
            for(Person each: this.penumpang) {
                System.out.println("      - Tujuan : " + each.getTujuan());
            }
            
            this.tujuan.remove(0);
        }
    }
}
