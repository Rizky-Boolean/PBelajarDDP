package com.ddp1;

public class cOperator {
  public static void main(String[] args) {
    // OPERATOR
    // 1.  Penegasan =
    // int bilangan = 1;

    // 2. Ariitmatika +, -, *, /, %, ++, --, +=, -=
    
    int a = 12;
    int b = 5;
    int c = 2;
    int tambah = a + b;
    int kurang = a - c;
    int kali = a * b;
    int bagi = a / c;
    int mod = a % b;
    int tambah1 = b++;
    int kurang1 = a--;
    System.out.println("Tambah : " +tambah+ "\nKurang : "+kurang+ "\nKali : "+kali+ "\nBagi : "+bagi+ "\nMod : "+mod+ "\ntambah 1 : "+tambah1+ "\nKurang 1"+kurang1);

    // 3. Pembanding <, >, <=, >=, ==, !=
    boolean hasil = a > b;
    System.out.println(hasil);

    // 4. Logika &&, ||, !
    // diskon harga
    int totalBayar = 150000;
    boolean shoppingCard = false;
    boolean diskon = totalBayar >= 100 && shoppingCard == true;

    System.out.println(diskon);

  }
  
}
