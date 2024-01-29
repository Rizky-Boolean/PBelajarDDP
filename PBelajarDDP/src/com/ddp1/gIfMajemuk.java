package com.ddp1;
//masukkan scanner
import java.util.Scanner;

// class if majemuk
public class gIfMajemuk {
  // Main activity
  public static void main(String[] args) {
    // Panggil Scanner
    Scanner inputan = new Scanner(System.in);

    // Jika pekerjaan PNS = Menantu idaman
    // Jika Tidak bekerja / pengangguran = Menantu yang Buruk
    // Jika pekerjaannya selain itu = Patut dipertimbangkan
    // Jika pekerjaan kosong keluar kata apakah anda pengangguran dan ulangi input pekerjaan
    // Nama tidak boleh kosong

    System.out.print("Masukkan nama Anda : ");
    String nama = inputan.nextLine();

    System.out.print("Apa Pekerjaan Anda : ");
    String pekerjaan = inputan.nextLine();

    if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("PNS")) {

      System.out.println("Hallo "+ nama +". Anda Adalah Menantu idaman\n");

    } else if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("Tidak Bekerja")|| pekerjaan.equalsIgnoreCase("Pengangguran")) {

      System.out.println("Hallo "+ nama +". Anda Tidak Boleh Menikahi Anak Saya. Cari Kerja dulu \n");

    } else {

      System.out.print("Maaf, Anda tidak diterima sebagai menantu");

    }

    // Menutup Scanner setelah penggunaan selesai
    inputan.close();

    
  }
  
}
