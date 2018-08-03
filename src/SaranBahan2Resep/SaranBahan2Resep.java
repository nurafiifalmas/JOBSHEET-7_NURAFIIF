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
    public static void main(String[] args) {
        String identitas = "Nurafiif Almas Azhari / X RPL 5/ 33";
        System.out.println("Identitas :"+ identitas);
       
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Pertama");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        
        System.out.print("Masukkan no Pilihan Anda:");
        int bahan1 = scanner.nextInt();


    }
              
}
