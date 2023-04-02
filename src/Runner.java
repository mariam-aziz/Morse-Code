import java.util.Scanner;
public class Runner {
    public static void main (String[] args){
        System.out.println("Enter 1 for Encryption or 2 for Decryption::");
        Scanner sc = new Scanner(System.in);
        String encryptionType = sc.nextLine();
        System.out.println("Enter the word or phrase::");
        String phrase = sc.nextLine();
        while(true) {
            if (encryptionType.equals("1")) {
                System.out.println(Main.encoder(phrase));
            } else {
                System.out.println(Main.decoder(phrase));
            }
            System.out.println("Would you like to continue? y/n?");
            String continued = sc.nextLine();
            if (continued.equals("n")) {
                break;
            } else {
                System.out.println("Type 1 for Encryption or 2 for Decryption::");
                encryptionType = sc.nextLine();
                System.out.println("Enter the word or phrase::");
                phrase = sc.nextLine();
            }
        }
    }
}
