

import java.util.Scanner;
public class Ganjil {
    public static void main(String[] args) {
        
        // int angka = 10;

        // if (angka % 2 == 0)
        //     System.out.println("Angka " + angka + " adalah genap");
        // else
        //     System.out.println("Angka " + angka + "adalah bilangan ganjil"); // tanpa scanner
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka: ");

        int angka= input.nextInt();

        if (angka % 2 == 0)
            System.out.println("Angka " + angka + " adalah genap");
        else
            System.out.println("Angka " + angka + "adalah bilangan ganjil");
    }
}
