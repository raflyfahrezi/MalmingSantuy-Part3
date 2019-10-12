/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raflyfahrezi;

/**
 *
 * @author Farhan R
 */
public class malmingasoy {
    static String nama, id;
    static int pinjam, kembali, lama, telat, denda;
    
    int lama(){
        lama = kembali - pinjam;
        return lama;
    }
    
    int telat(){
        telat = lama - 2;
        return telat;
    }
    
    int denda(){
        denda = telat * 2500;
        return denda;
    }
    
    public static void main(String[] args) {
        malmingasoy prosedur = new malmingasoy();
        
        nama = "Farhan";
        id = "10118377";
        pinjam = 2;
        kembali = 10;
        
        System.out.println("Nama Anda       : " + nama);
        System.out.println("ID Anda         : " + id);
        System.out.println("Tanggal Pinjam  : " + pinjam);
        System.out.println("Tanggal Kembali : " + kembali);
        System.out.println("Lama Pinjam     : " + prosedur.lama());
        System.out.println("Telat           : " + prosedur.telat());
        System.out.println("Denda           : " + prosedur.denda());
    }
}
