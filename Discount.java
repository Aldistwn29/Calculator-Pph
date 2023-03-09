

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        
        
        // deklarasi
        Double totalBelanja, discount;

        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan toatal belanja:");
        totalBelanja = input.nextDouble();

        if(totalBelanja > 100000);
        discount = (double)5/100 * totalBelanja;
        System.out.println(discount);
        totalBelanja = totalBelanja - discount;
        System.out.println(totalBelanja);
    }
    
    
}
