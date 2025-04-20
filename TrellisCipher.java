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
