// Nama Package (Harus sesuai dengan alamat lokasi folder berada)
package com.ddp1;

//  Nama Class(harus sesuai dengan folder yang dibuat ini)
public class bTipeData {

  // Main method(Bebas mau namain apa)
  public static void main(String[] args) {
    
    // BILANGAN BULAT(Biasanya dipakai untuk perhitungan)
    // Dipakai untuk menyatakan bilangan yang tidak mempunyaipecahan desimal, misalnya 34, 8, 1203, -7, 4324553, dll.

    // TIPE DATA
    // Byte(8 Bit), Short(16 Bit), Int(32 Bit), Long(64 Bit)


    // BYTE
    // Ukuran   : 8 Bit
    // Range    : -128 s.d. 127
    byte ukByte = 120;
    System.out.println("Byte : "+ ukByte);
    // ukByte = 130;  Tidak boleh melebihi 127 (ERROR BOS)
    // System.out.println("Byte Sekarang : "+ ukByte);

    // SORT
    // Ukuran   : 16 Bit
    // Range    : -32768 s.d. 32767
    short ukSort = 9988;
    System.out.println("Sort : "+ ukSort);
    // ukSort = 998877;  Tidak boleh melebihi 32767 (ERROR BOS)
    // System.out.println("Sort Sekarang : "+ ukSort);

    // INTEGER
    // Ukuran   : 32 Bit
    // Range    : -2147483648 s.d. 2147483647
    int ukInteger = 1122334455;
    System.out.println("Integer : "+ ukInteger);
    // ukInteger = 112233445566;  Tidak boleh melebihi 2147483647 (ERROR BOS)
    // System.out.println("Integer Sekarang : "+ ukInteger);

    // LONG
    // Ukuran   : 64 Bit
    // Range    : -9223372036854775808 s.d. 9223372036854775807
    // Khusus Long Akhirannya harus dikasih L untuk memberi tahu java bahwa itu tipe data Long
    long ukLong = 1122334455667788991L;
    System.out.println("Long : "+ ukLong);
    // ukLong = 1122334455667788991010L;  Tidak boleh melebihi 9223372036854775807 (ERROR BOS)
    // System.out.println("Long Sekarang : "+ ukLong);






    // BILANGAN PECAHAN(Biasanya dipakai untuk perhitungan yangg memiliki nilai koma)
    // Dipakai untuk menyatakan bilangan yang mempunyai pecahan desimal, misalnya 3.65, 0.0045, 29.0, dll.

    // TIPE DATA
    // Float(32 Bit), Double(64 Bit)


    // FLOAT
    // Ukuran   : 32 Bit
    // Range    : -3.4 x 1038 s.d. 3.4 x 1038
    // Khusus Float Akhirannya harus dikasih F untuk memberi tahu java bahwa itu tipe data Long
    float ukFloat = 97554.47F; // atau 97554.47f
    System.out.println("Float 1 : "+ ukFloat); // Output   = 97554.47

    ukFloat = 97554.472f;
    System.out.println("Float 2 : "+ ukFloat); // Output   = 97554.47

    ukFloat = 97554.475F;
    System.out.println("Float 3 : "+ ukFloat); // Output   = 97554.48

    ukFloat = 97554.477f;
    System.out.println("Float 4 : "+ ukFloat); // Output   = 97554.48

    ukFloat = 975548.47F;
    System.out.println("Float 5 : "+ ukFloat); // Output   = 975548.5

    ukFloat = 9755489.47f;
    System.out.println("Float 6 : "+ ukFloat); // Output   = 9755489.0

    ukFloat = 97554892.47F;
    System.out.println("Float 7 : "+ ukFloat); // Output   = 9.75549E7
    
    ukFloat = 975548933442.47f;
    System.out.println("Float 8 : "+ ukFloat); // Output   = 9.755489E11



    // DOUBLE
    // Ukuran   : 32 Bit
    // Range    : -1.8 x 10308 s.d. 1.8 x 10308
    // Khusus Double Akhirannya bisa dikasih D bisa juga tanpa akhiran D untuk memberi tahu java bahwa itu tipe data Long
    double ukDouble = 97554.1122334455; // atau 97554.1122334455D atau 97554.1122334455d
    System.out.println("Double 1 : "+ ukDouble); // Output   = 97554.1122334455

    ukDouble = 97554.11223344556D;
    System.out.println("Double 2 : "+ ukDouble); // Output   = 97554.11223344556

    ukDouble = 97554.112233445566d;
    System.out.println("Double 3 : "+ ukDouble); // Output   = 97554.11223344557

    ukDouble = 97554.1122334455667;
    System.out.println("Double 4 : "+ ukDouble); // Output   = 97554.11223344557

    ukDouble = 975545.1122334455D;
    System.out.println("Double 5 : "+ ukDouble); // Output   = 975545.1122334455

    ukDouble = 9755455.1122334455d;
    System.out.println("Double 6 : "+ ukDouble); // Output   = 9755455.112233445

    ukDouble = 97554556.1122334455;
    System.out.println("Double 7 : "+ ukDouble); // Output   = 9.755455611223345E7
    
    ukDouble = 975545566.1122334455;
    System.out.println("Double 8 : "+ ukDouble); // Output   = 9.755455661122334E8





  }



}
