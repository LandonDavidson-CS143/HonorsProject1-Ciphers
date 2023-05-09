import java.util.HashMap;

public class MonoalphabeticCipher implements Cipher {
    HashMap<Character, Character> encoder = new HashMap<>();
    HashMap<Character, Character> decoder = new HashMap<Character, Character>();
    public MonoalphabeticCipher(String key) {
        setKey(key);
    }
    public void setKey(String key) {
        String setKeys = "";
        for (String c : key.toLowerCase().split("")) {
            if (!setKeys.contains(c)) {
                setKeys += c;
            }
        }
        if (setKeys.length() < 26) {
            for (char i = 'a'; i < 'z' + 1; i++) {
                if (!setKeys.contains(Character.toString(i))) {
                    setKeys += i;
                }
            }
        }
        char[] keyChar = setKeys.toCharArray();
        for (char c = 'a'; c < 'z' + 1; c++) {
            int i = c - 'a';
            encoder.put(c, keyChar[i]);
            decoder.put(keyChar[i], c);
        }
    }
    @Override
    public String encode(String plainText) {
        plainText = plainText.toLowerCase();
        String[] words = plainText.split(" ");
        StringBuilder cipherText = new StringBuilder();
        for (String w : words) {
            for (int i = 0; i < w.length(); i++) {
                if (!Character.isAlphabetic(w.charAt(i))) {continue;}
                cipherText.append(encoder.get(w.charAt(i)));
            }
            cipherText.append(" ");
        }
        return cipherText.toString();
    }

    @Override
    public String decode(String cipherText) {
        cipherText = cipherText.toLowerCase();
        String[] words = cipherText.split(" ");
        StringBuilder plainText = new StringBuilder();
        for (String w : words) {
            for (int i = 0; i < w.length(); i++) {
                if (!Character.isAlphabetic(w.charAt(i))) {continue;}
                plainText.append(decoder.get(w.charAt(i)));
            }
            plainText.append(" ");
        }
        return plainText.toString();
    }
}
