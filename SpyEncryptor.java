import java.util.Scanner;

public class SpyEncryptor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Spy Encryptor 1.0\n---------------\n");
        String option1 = "1. Caesar's Cipher\n";
        String option2 = "2. Pig Latin\n";
        String option3 = "3. Monoalphabetic Cipher\n";
        String option4 = "4. Character Shift Cipher\n";
        String option5 = "5. Exit\n";
        String prompt = option1 + option2 + option3 + option4 + option5 + "Please Select an above option: ";
        while (true) {
            System.out.print("\n" + prompt);
            int choice = input.nextInt();

            if (choice == 5) {
                System.out.println("Thank you for using Spy Encryptor");
                break;
            }

            System.out.print("Are you (1) encrypting or (2) decrypting? ");
            int direction = input.nextInt();
            input.nextLine();

            System.out.print("Input text you would like to process: ");
            String text = input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter how many letters you want to shift your message by (ex: b is shifted 1 from a): ");
                    int key = input.nextInt();
                    CaesarsCipher cc = new CaesarsCipher(key);
                    System.out.println(encodeDecode(cc, text, direction));
                }
                case 2 -> {
                    System.out.print("Enter what letters you want each of your words to end in: ");
                    String key = input.next();
                    PigLatin pl = new PigLatin(key);
                    System.out.println(encodeDecode(pl, text, direction));
                }
                case 3 -> {
                    System.out.println("You can either enter a full set of 26 unique scrambled letters, or just a word and the program will fill in the rest for you");
                    System.out.print("Enter the encryption key for your message: ");
                    String key = input.next();
                    MonoalphabeticCipher mc = new MonoalphabeticCipher(key);
                    System.out.println(encodeDecode(mc, text, direction));
                }
                case 4 -> {
                    System.out.print("Enter a single character as your encryption key: ");
                    char key = input.next().charAt(0);
                    CharacterShift cs = new CharacterShift(key);
                    System.out.println(encodeDecode(cs, text, direction));
                }
            }
        }
    }
    public static String encodeDecode(Cipher c, String text, int direction) {
        switch (direction) {
            case 1 -> {
                return c.encode(text);
            }
            case 2 -> {
                return c.decode(text);
            }
            default -> {
                return "Invalid direction";
            }
        }
    }
}
