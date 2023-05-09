public class CharacterShift implements Cipher {
    private final char shift;
    public CharacterShift(char shift) {
        this.shift = shift;
    }
    @Override
    public String encode(String plainText) {
        String[] words = plainText.split(" ");
        StringBuilder cipherText = new StringBuilder();
        for (String w : words) {
            for (int i = 0; i < w.length(); i++) {
                char c = w.charAt(i);
                c += shift;
                cipherText.append(c);
            }
            cipherText.append(" ");
        }
        return cipherText.toString();
    }

    @Override
    public String decode(String cipherText) {
        String[] words = cipherText.split(" ");
        StringBuilder plainText = new StringBuilder();
        for (String w : words) {
            for (int i = 0; i < w.length(); i++) {
                char c = w.charAt(i);
                c -= shift;
                plainText.append(c);
            }
            plainText.append(" ");
        }
        return plainText.toString();
    }
}
