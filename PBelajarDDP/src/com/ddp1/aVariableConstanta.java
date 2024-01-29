// Nama Package (Harus sesuai dengan alamat lokasi folder berada)
package com.ddp1;

//  Nama Class(harus sesuai dengan folder yang dibuat ini)
public class aVariableConstanta {
  

  // Main method(Bebas mau namain apa)
  public static void main(String[] args) {
    
    // VARIABLE & CONSTANTA
    // VARIABLE = Dapat dirubah isinya
    // CONSTANTA = tidak dapat dirubah isinya(TETAP)

    // VARIABLE
    // Contoh 1
    int a;
    a = 1;
    System.out.println("Nilai a :" + a );
    a = 5;
    System.out.println("Nilai a sekarang : " + a);

    // Contoh 2
    int b = 2;
    System.out.println("Nilai a :" + b );
    b = 10;
    System.out.println("Nilai a sekarang : " + b);

    // CONSTANTA
    final double phi = 3.14;
    System.out.println("Nilai phi :" + phi);
    // phi = 14; tidak bisa dirubah karena sudah konstan(ERROR BOS)
    // System.out.println("Nilai phi sekarang :" + phi);
    

  }
  
}
