package praktikum2;
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        int panjang,lebar,tinggi,rumus;
        
        System.out.print("panjang balok : ");
        panjang = input.nextInt();
        
        System.out.print("lebar balok : ");
        lebar = input.nextInt();
        
        System.out.print("tinggi balok : ");
        tinggi = input.nextInt();
        
        rumus = panjang*lebar*tinggi;
        System.out.println("Volume Balok adalah " + rumus);
        
    }
}
