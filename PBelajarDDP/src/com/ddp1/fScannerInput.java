package com.ddp1;

// Panggil Scanner
import java.util.Scanner;

public class fScannerInput {
  
  public static void main(String[] args) {
    //taruh scanner ddalam kelas
    Scanner inputData = new Scanner(System.in);

    System.out.print("Masukkan data Awal :");
    int nilai = inputData.nextInt();
    // TIPEE SCANNER
    // nextInt() = untuk inputan tipe data Inteeger
    // next() = untuk inputan tipe data String 1 kalimat
    // nextLine() = untuk inputan tipe data String >= 1 kalimat
    // dan masih banhak lagi
    
    System.out.print("Nilai saat ini : " + nilai + "\n");

    // Menutup Scanner setelah penggunaan selesai
    inputData.close();
    
  }
}
