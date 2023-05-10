/*
Name: Landon Davidson
Section: 32768
Program Name: MonoalphabeticCipher

Description: Implements Cipher interface. creates a scrambled unique set of letters out of the user inputted KEY, and
maps the original alphabet to the new set.
Ex: a KEY of "follow" would create "folwabcdeghijkmnpqrstuvxyz" by taking each unique letter from the KEY and places the
remaining alphabet at the end of it to create a full set. Using this KEY, "happy" would turn into "dfnny".
 */
import java.util.HashMap;

public class MonoalphabeticCipher implements Cipher {
  private final HashMap<Character, Character> encoder = new HashMap<>();
  private final HashMap<Character, Character> decoder = new HashMap<>();
  public MonoalphabeticCipher(String key) {
    StringBuilder setKeys = new StringBuilder();
    for (String c : key.toLowerCase().split("")) {
      if (!setKeys.toString().contains(c)) {
        setKeys.append(c);
      }
    }
    if (setKeys.length() < 26) {
      for (char i = 'a'; i < 'z' + 1; i++) {
        if (!setKeys.toString().contains(Character.toString(i))) {
          setKeys.append(i);
        }
      }
    }
    char[] keyChar = setKeys.toString().toCharArray();
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
