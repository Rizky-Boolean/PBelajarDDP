package com.ddp1;

public class kArray {
  public static void main(String[] args) {
    // ARRAY 1 Dimesi
    // Assignment
    int[] angka = {1, 3, 5, 7, 9}; // bisa juga -> int angka[] = {1, 3, 5, 7, 9};
    
    for (int i = 0; i < angka.length; i++ ){ // bisa juga -> for (int i = 0; i <= 5;i++ )
      System.out.print(angka[i]+ " ");
    }

    System.out.println("\n- - - -  - - - - -\n");
    // Declaration
    int bilangan[] = new int[5];

    bilangan[0] = 10;
    bilangan[3] = 8;

    for (int i = 0; i < bilangan.length; i++ ){ // bisa juga -> for (int i = 0; i <= 5;i++ )
      System.out.print(bilangan[i]+ " ");
    }

    System.out.println("\n\n- - - -  - - - - -\n");
    
    // Array 2 Dimesi
    // Assignment
    int[][] angka2 = {{1, 2, 3}, {3, 2, 1}, {4, 5, 6}, {6, 4, 3}}; // bisa juga -> int angka2[][] = {. . . .};
    
    for (int i = 0; i < angka2.length; i++ ){ // bisa juga -> for (int i = 0; i <= 5;i++ )
      for (int a = 0; a < angka2[i].length; a++){
        System.out.print(angka2[i][a]+ " ");
      }
      System.out.println();
    }

    System.out.println("\n- - - -  - - - - -\n");
    // Declaration
    int bilangan2[][] = new int[3][5];

    bilangan2[0][1] = 7;
    bilangan2[2][3] = 7;

    for (int i = 0; i < bilangan2.length; i++ ){ // bisa juga -> for (int i = 0; i <= 5;i++ )
      for (int a = 0; a < bilangan2[i].length; a++){
        System.out.print(bilangan2[i][a]+ " ");
      }
      System.out.println();
    }





  }
}
