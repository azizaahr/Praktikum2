package praktikum1;
import java.util.Scanner;
public class KalimatEscape2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kalimat : ");
        String kalimat = input.nextLine();
       
        System.out.println("Kalimat anda : " + "\"" + kalimat + "\"");
    }
}
