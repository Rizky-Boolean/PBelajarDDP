package com.ddp1;

public class dCasting {

  public static void main(String[] args) {
    // Casting
    // adalah salah satu teknik untuk merubah suatu tipe data menjadi tipe data yg lain

    int a = 5, b = 2;

    int hasil = a / b; // hasilnya 2
    System.out.println("\n"+hasil+"\n");
    
    // jika diganti float
    float hasilFloat = a/b; // hasilnya 2,0
    System.out.println("\n"+hasilFloat+"\n");
    
    // jika dirubah menggunakan teeknik casting
    float hasilCasting = (float)a / (float)b; // maka hasiilnya sesuai dengan yg di inginkan
    System.out.println("\n"+hasilCasting+"\n");

    

  }
  
}
