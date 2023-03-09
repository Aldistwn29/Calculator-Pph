
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Gaji{
    public static void main(String[] args) {
        
        /// deklarasi variabel

        double gajiPokok, gajiTotal, UpahLembur, UpahLemburPerjam, Bonus;
        int jamLembur;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan gaji pokok: ");
        gajiPokok = inputan.nextDouble();

        System.out.print("Jam Lembur: ");
        jamLembur = inputan.nextInt();

        UpahLemburPerjam = gajiPokok/173;

        System.out.print("Masukan bonus");
        Bonus = inputan.nextDouble();

        if (jamLembur <= 5){
            UpahLembur = (5*1.5*UpahLemburPerjam) + ((jamLembur-5)*2*UpahLemburPerjam);
        }else{
            UpahLembur = jamLembur*1.5*UpahLemburPerjam;
        }

        gajiTotal = gajiPokok + UpahLembur;

        NumberFormat nf = NumberFormat.getInstance(new Locale("usa","USA"));
        
        String gajiTotalFormatted = nf.format(gajiTotal);

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Upah Lembur " + UpahLembur);
        System.out.println("Bonus " + Bonus);
        System.out.println("Gaji total: " + gajiTotalFormatted);
        


    }
}
