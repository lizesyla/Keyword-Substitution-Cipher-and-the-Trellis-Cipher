import java.util.*;

public class KeywordSubstitutionCipher {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generateCipherAlphabet(String keyword) {
        keyword = keyword.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder cipherAlphabet = new StringBuilder();

        Set<Character> seen = new LinkedHashSet<>();
        for (char ch : keyword.toCharArray()) {
            seen.add(ch);
        }
        for (char ch : ALPHABET.toCharArray()) {
            seen.add(ch);
        }
        for (char ch : seen) {
            cipherAlphabet.append(ch);
        }
        return cipherAlphabet.toString();
    }

 public static String encrypt(String message, String keyword) {
        String cipherAlphabet = generateCipherAlphabet(keyword);
        StringBuilder encrypted = new StringBuilder();

        for (char ch : message.toUpperCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = ALPHABET.indexOf(ch);
                encrypted.append(cipherAlphabet.charAt(index));
            } else {
                encrypted.append(ch); // Keep spaces/punctuation
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String encryptedMessage, String keyword) {
        String cipherAlphabet = generateCipherAlphabet(keyword);
        StringBuilder decrypted = new StringBuilder();

        for (char ch : encryptedMessage.toUpperCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = cipherAlphabet.indexOf(ch);
                decrypted.append(ALPHABET.charAt(index));
            } else {
                decrypted.append(ch);
            }
        }
        return decrypted.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter keyword: ");
        String keyword = scanner.nextLine();

        System.out.print("Choose (E)ncrypt or (D)ecrypt: ");
        String choice = scanner.nextLine().trim().toUpperCase();

        if (choice.equals("E")) {
            System.out.print("Enter message to encrypt: ");
            String message = scanner.nextLine();
            String encrypted = encrypt(message, keyword);
            System.out.println("Encrypted message: " + encrypted);
        } else if (choice.equals("D")) {
            System.out.print("Enter message to decrypt: ");
            String encryptedMessage = scanner.nextLine();
            String decrypted = decrypt(encryptedMessage, keyword);
            System.out.println("Decrypted message: " + decrypted);
        } else {
            System.out.println("Invalid option. Use 'E' or 'D'.");
        }

        scanner.close();
    }
}