

import java.util.Scanner;

public class CalculatorPPh{
    public static void main(String[] args) {
        
        // DEKLARASI VARIABEL
        double gajiBersih, ptkp, pkp, pph;
        
        // Membuat Scanner
        Scanner input = new Scanner(System.in);

        // Memasukan gaji bersih dan PTKP
        System.out.print("Masukkan Gaji Bersih:");
        gajiBersih = input.nextDouble();
        System.out.print("Masukan PTKP:");
        ptkp = input.nextInt();

        // menghitung pkp

        double pkp1 = gajiBersih - ptkp;
        double pkp2 = pkp1 < 0 ? 0 : pkp1;
        pkp = pkp2;

        // Menghitun PPh

        if(pkp <= 50000000){
            pph = pkp * 0.15;
        } else if(pkp <= 250000000){
                pph = (pkp - 50000000) * 0.15 + 2500000;
        }else if(pkp <= 500000000){
            pph = (pkp - 250000000) * 0.25 + 32500000;
        } else if (pkp <= 500000000) {
            pph = (pkp - 500000000) * 0.30 + 95000000;
        } else {
            pph = (pkp - 500000000) * 0.35 + 190000000;
        }

        // Output PPH
        System.out.println("PPH Anda adalah: " + pph);
        }
}
