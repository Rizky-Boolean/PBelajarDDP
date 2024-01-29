package com.ddp1;

public class eLogikaIF {

  public static void main(String[] args) {
    int i = 80;
    //if tunggal
    if (i >= 70) {
      System.out.println("\nNilai anda bagus\n");
    }else{
      System.out.println("\nNilai anda Jelek\n");
    }

    String jurusan = "Informatika";
    //penggunan equals
    if (jurusan.equals( "informatika")) {
      System.out.println("\nBenar\n");
    }else{
      System.out.println("\nSalah\n");
    }

    String Kelas = "Informatika";
    //penggunan equals
    if (Kelas.equalsIgnoreCase( "infoRmaTika")) {
      System.out.println("\nBenar\n");
    }else{
      System.out.println("\nSalah\n");
    }
    

  }
  
}
