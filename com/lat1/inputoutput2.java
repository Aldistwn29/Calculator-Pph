package com.lat1;

// import library
import java.util.Scanner;

public class inputoutput2 {
    public static void main(String [] args){

        // cara ini tanpa mengdeklarasikan sebuah variabel

        // sebelum itu kalian mengimport libray baru di bawah ini
        Scanner scanner= new Scanner(System.in);

        System.out.print("Masukan Nama anda : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukan alamat anda : ");
        String alamat = scanner.nextLine();
        
        System.out.print("Masukan umur anda : ");
        int umur = scanner.nextInt();

        System.out.print("Masukan Tinggi badan anda : ");
        Double tinggiBadan= scanner.nextDouble();



        // menggambungkan output di atas menjadi satu input

        System.out.println(" Halo " + nama + ", usia anda adalah " + umur + " tahun dan tingi anda adalah " + tinggiBadan + " cm , alamat anda di " + alamat + ".");






    }
}
