package com.ddp1;

import java.util.Scanner;

public class jLooping {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("\nMasukkan Looping :");
    int masuk = input.nextInt();
    
    System.out.println("\nLoopig FOR");
    // Looping FOR
    for(int awalFor = 1; awalFor <= masuk ; awalFor++ ){
      System.out.println(awalFor);
    }
    
    
    System.out.println("\nLoopig WHILE");
    // Looping WHILE
    int awalWhile = 1; 
    while (awalWhile <= masuk) {
      System.out.println(awalWhile);
      awalWhile++;
    }
    
    System.out.println("\nLoopig DO WHILE");
    // Looping DO WHILE
    int awalDoWhile = 1;
    do{
      System.out.println(awalDoWhile);
      awalDoWhile++;
    }while(awalDoWhile <= masuk);


    input.close();
  }
  
}
