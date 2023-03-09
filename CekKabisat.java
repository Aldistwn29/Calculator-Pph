
import java.util.Scanner;

public class CekKabisat {
    public static void main(String[] args){

        // Deklarasi Variabel
        int tahun;
        Scanner input = new scanner(System.in);
        System.out.print("Masukan Tahun: ");
        tahun = input.nextInt();

        if (tahun % 4 == 0 && tahun % 100 != 0 || tahun % 400 == 0){
            System.out.println("Merupakan Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }

}
