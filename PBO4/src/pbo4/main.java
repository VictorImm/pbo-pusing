/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo4;

/**
 * Nama : Victor Immanuel Sunarko
 * NPM  : 21081010145
 */

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang[] arrOfBangunRuang = {
            new Kubus(3),
            new Kubus(2),
            new Balok(6, 7, 2),
            new Balok(1, 2, 3),
            new LimasSegiEmpat(1, 2),
            new LimasSegiEmpat(2, 3),
            new Bola(10),
            new Bola(),
            new Tabung(5, 10),
            new Tabung(10, 5)
        };
        
        double sum = 0;
        
        System.out.println("Isi dari array adalah : ");
        for(BangunRuang bangun : arrOfBangunRuang){
            bangun.computeAndSetVolume();
            
            if(bangun instanceof Kubus){
                System.out.print("Bangun Kubus dengan volume : ");
                System.out.println(bangun.getVolume());
            }
            else if(bangun instanceof Kubus){
                System.out.print("Bangun Kubus dengan volume : ");
                System.out.println(bangun.getVolume());
            }
            else if(bangun instanceof Balok){
                System.out.print("Bangun Balok dengan volume : ");
                System.out.println(bangun.getVolume());
            }
            else if(bangun instanceof LimasSegiEmpat){
                System.out.print("Bangun Limas Segi Empat dengan volume : ");
                System.out.println(bangun.getVolume());
            }
            else if(bangun instanceof Bola){
                System.out.print("Bangun Bola dengan volume : ");
                System.out.println(bangun.getVolume());
            }
            else if(bangun instanceof Tabung){
                System.out.print("Bangun Tabung dengan volume : ");
                System.out.println(bangun.getVolume());
            }
            
            sum += (bangun.getVolume());
        }
        
        // print rata-rata volume
        System.out.print("\n\nRata-rata volume bangun ruang : ");
        System.out.println(sum/arrOfBangunRuang.length);
    }
    
}
