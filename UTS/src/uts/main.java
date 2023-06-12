/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        // buat objek halte dengan isi berupa ArrayList penumpang dan tujuannya
        Halte Porong = new Halte(
                "Porong", 
                new ArrayList<Person>() {
                    {
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                    }
                }
        );
        Halte Surabaya = new Halte(
                "Surabaya", 
                new ArrayList<Person>() {
                    {
                        add(new Person("Gresik"));
                        add(new Person("Gresik"));
                        add(new Person("Kandangan"));
                        add(new Person("Kandangan"));
                        add(new Person("Kandangan"));
                    }
                }
        );
        Halte Gresik = new Halte(
                "Gresik", 
                new ArrayList<Person>() {
                    {
                        add(new Person("Kandangan"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Surabaya"));
                        add(new Person("Porong"));
                        add(new Person("Porong"));
                    }
                }
        );
        Halte Kandangan = new Halte(
                "Kandangan", 
                new ArrayList<Person>() {
                    {
                        add(new Person("Gresik"));
                        add(new Person("Gresik"));
                        add(new Person("Gresik"));
                        add(new Person("Gresik"));
                        add(new Person("Gresik"));
                        add(new Person("Surabaya"));
                    }
                }
        );
        
        // buat objek bus dengan isi penumpang 5, tujuan berbeda,
        // dan inisalisasi tujuan bus
        Bus b1 = new Bus(
                new ArrayList<Person>() {
                    {
                        add(new Person("Porong"));
                        add(new Person("Porong"));
                        add(new Person("Surabaya"));
                        add(new Person("Gresik"));
                        add(new Person("Kandangan"));
                        
                    }
                },
                new ArrayList<Halte>() {
                    {
                        add(Porong);
                        add(Surabaya);
                        add(Gresik);
                        add(Kandangan);
                        add(Surabaya);
                        add(Porong);
                    }
                }
        );
        b1.run();
    }
    
}
