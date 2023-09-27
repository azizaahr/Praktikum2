package praktikum2;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        
        double r, luasLingkaran;
        final double pi= 3.141592;
        
        System.out.print("jari-jari : ");
        r = input.nextDouble();
        
        luasLingkaran = pi*r*r;
        System.out.println("Luas Lingkaran : " + Math.round (luasLingkaran));
       
    }
    
}
