
package praktikum1;
import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     String nama,nim,prodi;
     
        System.out.print("Nama : " );
        nama= input.nextLine();
        System.out.print("NIM : " );
        nim = input.nextLine();
        System.out.print("Prodi : ");
        prodi = input.nextLine();
        
        System.out.println("Selamat Datang" + " " + nama + " dengan NIM " + nim + " dari " +  prodi);
        
    }
    
}
