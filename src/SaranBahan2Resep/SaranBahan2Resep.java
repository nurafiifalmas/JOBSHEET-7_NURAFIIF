/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaranBahan2Resep;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SaranBahan2Resep {
   public static void main(String [] args){
    String identitas = "Nurafiif Almas Azhari/XRPL5/33";
    System.out.println("Identitas : " + identitas);
    
    System.out.print("\nSaran Resep dari bahan milik anda\n");
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bahan Pertama: ");
    System.out.println("1. Pisang");
    System.out.println("2. Telur");
    System.out.print("Masukkan no pilihan anda :");
    int bahan1 = scanner.nextInt();
    
     if (bahan1 == 1 || bahan1 == 2)
    {
        System.out.println("Bahan Kedua : ");
        if(bahan1 == 1){
            System.out.println("1. Susu");
            System.out.println("2. Minyak Goreng");
            System.out.println("3. Tidak ada");
        }else{
            System.out.println("1. Minyak Goreng");
            System.out.println("2. Roti");
            System.out.println("3. Tidak ada");
        }
        System.out.println("Masukkan no pilihan anda :");
        int bahan2 = scanner.nextInt();
        
    }else
         System.out.println("Mohon Maaf,pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
     
     int bahan2 = scanner.nextInt();
     if (bahan2 >= 1 && bahan2 <= 3)
     {
         if(bahan1==1)
             switch(bahan2)
             {
                 case 1: System.out.println("anda dapat membuat milkshake banana"); break;
                 case 2: System.out.println("anda dapat membuat pisang goreng"); break;
                 case 3: System.out.println("anda dapat membuat pisang rebus"); break;
             }
         else
             switch(bahan2)
             {
                 case 1: System.out.println("anda dapat membuat telur mata sapi"); break;
                 case 2: System.out.println("anda dapat membuat sandwich"); break;
                 case 3: System.out.println("anda dapat membuat telur rebus"); break;
             }
     }else
         System.out.println("Mohon Maaf,pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
     
        }
   
    

