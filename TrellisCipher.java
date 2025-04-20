import java.util.*;

public class TrellisCipher {
    private static final int[][] trellisKey = {
        {2, 0, 1},
        {1, 2, 0},
        {0, 1, 2}
    };

    // Enkriptimi i tekstit në blloqe me bazë matricën trellis
    public static String encrypt(String plainText) {
        plainText = plainText.replaceAll("\\s+", "").toUpperCase();
        int blockSize = trellisKey.length;
        StringBuilder cipherText = new StringBuilder();

        for (int i = 0; i < plainText.length(); i += blockSize) {
            char[] block = new char[blockSize];

            for (int j = 0; j < blockSize; j++) {
                int keyIndex = trellisKey[j][j];
                if (i + keyIndex < plainText.length()) {
                    block[j] = plainText.charAt(i + keyIndex);
                } else {
                    block[j] = 'X'; 
                }
            }

            cipherText.append(block);
        }

        return cipherText.toString();
    }


// Dekriptimi i tekstit të enkriptuar
    public static String decrypt(String cipherText) {
        cipherText = cipherText.replaceAll("\\s+", "");
        int blockSize = trellisKey.length;
        StringBuilder plainText = new StringBuilder();

        for (int i = 0; i < cipherText.length(); i += blockSize) {
            char[] block = new char[blockSize];

            for (int j = 0; j < blockSize; j++) {
                block[trellisKey[j][j]] = cipherText.charAt(i + j);
            }

            plainText.append(block);
        }

        return plainText.toString();
    }

    public static void main(String[] args) {
        String originalText = "HELLO WORLD";
        System.out.println("Teksti origjinal: " + originalText);

        String encrypted = encrypt(originalText);
        System.out.println("Teksti i enkriptuar: " + encrypted);

        String decrypted = decrypt(encrypted);
        System.out.println("Teksti i dekriptuar: " + decrypted);
    }
}
