
package praktikum2;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        
        int a;
        System.out.print("Masukkan a : ");
        a = input.nextInt();
       
        String keadaan = a % 2 == 0 ? "Genap":"Ganjil";
        System.out.println("Merupakan bilangan " + keadaan);
      
    }
}
