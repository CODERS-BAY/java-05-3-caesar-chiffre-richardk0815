import java.util.Random;
import java.util.Scanner;

public class caesarChiffre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eingabeText = scanner.next();

        char[] letter= eingabeText.toCharArray();

        Random key = new Random();
        int rotationKey;
        rotationKey = key.nextInt(26);
        System.out.println("Rotationkey = " + rotationKey);


        for (int i = 0; i < letter.length; i++) {
            char buchstabe = letter[i];
            int alphabetStart = 'a';
            buchstabe -= alphabetStart;
            buchstabe += rotationKey;
            buchstabe %= 26;
            buchstabe += alphabetStart;
            System.out.print(buchstabe);
        }

    }
}
