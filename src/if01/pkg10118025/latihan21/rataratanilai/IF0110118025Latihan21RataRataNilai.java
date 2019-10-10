/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan21.rataratanilai;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 * 
 */
public class IF0110118025Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, jmlhMhs;
        double Total;
        double nilai;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Mahasiswa : ");
        jmlhMhs = scan.nextInt();
        
        i = 1;
        Total = 0;
        
        while(i <= jmlhMhs){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scan.nextDouble();
            Total += nilai;
            
            i++;
        }
        System.out.println("\nMaka, Rata-Rata Nilai Mahasiswa adalah " + Total/jmlhMhs);
        System.out.println("Developed By Rizki Restu Illahi");
    }
    
}
