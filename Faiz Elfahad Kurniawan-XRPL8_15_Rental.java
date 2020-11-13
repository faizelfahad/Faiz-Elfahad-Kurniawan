/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental;

import java.util.Scanner;

/**
 *
 * @author FAIZ
 */
public class Rental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int hari;
        
        System.out.println("Welcome To Rental PS 5 Gan");
        System.out.println("Dimohon Mengisi Kolom Dibawah Ini");
        System.out.print("Nama  = ");
        String Nama = input.next();
        System.out.print("Alamat = ");
        String Alamat = input.next();
        System.out.print("Tanggal Sewa = ");
        String Tanggal = input.next();
        System.out.print("Bulan = ");
        String Bulan = input.next();
        
  
        System.out.print("Masukkuan Jumlah Lama Sewa (Hari) = ");
        hari = input.nextInt();
        
        switch (hari) {
            case 1:
              System.out.println("Total Pembayaran Rp 40.000");
              
              System.out.println("Silahkan Membayar Ke Kasir");
              break;
            case 2:
              System.out.println("Total Pembayaran Rp 75.000");
              
              System.out.println("Silahkan Membayar Ke Kasir");
              break;
            case 3:
              System.out.println("Total Pembayaran Rp 105.000");
              
              System.out.println("Silahkan Membayar Ke Kasir");
              break;
            case 4:
              System.out.println("Total Pembayaran Rp 155.000");
              
              System.out.println("Silahkan Membayar Ke Kasir");
              break;
            case 5:
               System.out.println("Total Pembayaran Rp 180.000");
               
               System.out.println("Silahkan Membayar Ke Kasir");
               break;
            case 6:
                System.out.println("Total Pembayaran Rp 220.000");
                
                System.out.println("Silahkan Membayar Ke Kasir");
                break;
            case 7:
                System.out.println("Total Pembayaran Rp 255.000");
                
                System.out.println("Silahkan Membayar Ke Kasir");
                break;
            default : 
                System.out.println("Skip Gan Mending Rakit PC!");
                
                System.out.println("Silahkan Memulai Kembali");
                
        }
        
        System.out.println("Terima Kasih");
    }
    
}
