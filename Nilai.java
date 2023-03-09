import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka: ");

        int angka= input.nextInt();
        String indexnilai;

        if (angka >= 75)
            indexnilai = "A";
        else if (angka >= 65)
            indexnilai= "B";
        else if (angka >= 55)
            indexnilai= "C";
        else 
            indexnilai="D";
            

            System.out.println("index Nilai: " + indexnilai);
    }
}

