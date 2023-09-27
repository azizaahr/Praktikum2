package praktikum1;
import java.util.Scanner;
public class KalimatEscape {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        System.out.print("Kalimat 1 : ");
        String kalimat1 = input.nextLine();
        
        System.out.print("Kalimat 2: ");
        String kalimat2 = input.nextLine();
        
        System.out.print("Kalimat 3 : ");
        String kalimat3 = input.nextLine();
        
        System.out.println("Kalimat anda adalah " + "\n" + kalimat1 + "\n" + kalimat2 + "\n" + "\t" + kalimat3);
    }
}
