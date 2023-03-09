package com.lat1;

// import library Scanner
import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        
        ///deklarasi variabel
        String nama, jurusan;
        int umur;
        Double ipk;

        /// membuat scanner baru
        Scanner input = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("=====Pendataan Mahasiswa=====");
        /// menggunakan scanner apa yg di ketik ke dalam variabel 
        /// jika tipe data string menggunakan nextLine, jika integer nextInt, jika Double nextDouble
        
        System.out.print("Nama  :");
        nama  = input.nextLine();
        System.out.print("Masukan jurusan :");
        jurusan = input.nextLine();
        System.out.print("Masukan umur :");
        umur = input.nextInt();
        System.out.print("Masukan ipk :");
        ipk = input.nextDouble();


        // tampilkan hasil output di atas di simpan pada satu variabel

        System.out.println("==================");
        System.out.println("Nama  :" + nama);
        System.out.println("jurusan :" + jurusan);
        System.out.println("umur :" + umur);
        System.out.println("ipk :" + ipk);


    }
}

