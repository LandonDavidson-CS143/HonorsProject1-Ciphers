/*
Name: Landon Davidson
Section: 32768
Program Name: CaesarsCipher

Description: Implements the Cipher interface and shifts every letter in the input text KEY spots right in the alphabet.
Ex: "ab", with the key 3 would turn into "de" and "z" would be "c".
 */

public class CaesarsCipher implements Cipher {
  private final int shift;
  public CaesarsCipher(int shift) {
    this.shift = shift % 26;
  }

  @Override
  public String encode(String plainText) {
    String[] words = plainText.split(" ");
    StringBuilder cipherText = new StringBuilder();
    for (String w : words) {
      for (int i = 0; i < w.length(); i++) {
        char c = w.charAt(i);
        if (!Character.isAlphabetic(c)) {cipherText.append(c);continue;}
        if (Character.isUpperCase(c)) {
          c += shift;
          if (c < 65) {c += 26;}
          c -= 65;
          c %= 26;
          c += 65;
        }
        else {
          c += shift;
          if (c < 97) {c += 26;}
          c -= 97;
          c %= 26;
          c += 97;
        }
        cipherText.append(c);
      }
      cipherText.append(' ');
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
        if (!Character.isAlphabetic(c)) {plainText.append(c);continue;}
        if (Character.isUpperCase(c)) {
          c -= shift;
          if (c < 65) {c += 26;}
          c -= 65;
          c %= 26;
          c += 65;
        }
        else {
          c -= shift;
          if (c < 97) {c += 26;}
          c -= 97;
          c %= 26;
          c += 97;
        }
        plainText.append(c);
      }
      plainText.append(' ');
    }
    return plainText.toString();
  }
}
