package com.ddp1;
import java.util.Scanner;

public class hSwitchCase {


  // Main method
  public static void main(String[] args) {

    short jumlah;
    int harga;
    Scanner in = new  Scanner(System.in);

    System.out.print("\n=== Pilih Menu ===\n"+
    "1. Nasi Goreng (Rp. 12.000)\n"+
    "2. Nasi Ayam (Rp. 11.000)\n"+
    "3. Nasi Ikan (Rp. 10.000)\n"+
    "Pilih Menu [1/2/3] : ");
    String pilihan = in.next();

    System.out.print("Masukkan Jumlah Pesanan : ");
    jumlah = in.nextShort();

    System.out.println("\n- - - - - - - -");

    switch (pilihan) {
      case "1":
        harga = jumlah * 12;
        System.out.println("\nAnda memesan Nasi Goreng "+jumlah+ "\nTotal harga : Rp."+harga+ ".000\n");
        break;

      case "2":
        harga = jumlah * 11;
        System.out.println("\nAnda memesan Nasi Ayam "+jumlah+ "\nTotal harga : Rp."+harga+ ".000\n");
        break;

      case "3":
        harga = jumlah * 10;
        System.out.println("\nAnda memesan Nasi Ikan "+jumlah+ "\nTotal harga : Rp."+harga+ ".000\n");
        break;
      
      default:
        System.out.println("Pilihan anda salah !\n");
        break;
    }

    in.close();

  }
  
}
