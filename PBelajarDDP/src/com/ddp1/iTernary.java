package com.ddp1;

import java.util.Scanner;

public class iTernary {

  // Prcabanggan Ternary
  // Untuk memberikan NILAI kedalam VARIABLE menggunakan KONDISI.

  // SOAL
  // nilai >= 70 && nilai <=100
  // Jika benar keteranggan = LULUS
  // Jika salah = TIDAK LULUS

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int masuk = input.nextInt();

    // Jika menggunakan IF
    // if (masuk >= 70 && masuk <= 100) {
    //   System.out.println("LULUS");
    // }else{
    //   System.out.println("TIDAK LULUS");
    // }

    // Jika menggunakan Ternary
    String keterangan = masuk >= 70 && masuk <= 100 ? "LULUS" :  "TIDAK LULUS";

    System.out.println(keterangan);



    input.close();
  }


  
}
