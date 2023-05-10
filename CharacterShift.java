/*
Name: Landon Davidson
Section: 32768
Program Name: CharacterShift

Description: Implements the Cipher Interface. Takes a single char as SHIFT and for each letter in the input text the
SHIFT value is added to the letters char value to create the new char. Ex: the letter "e" has a char value of 101,
so if your key was 'A' which has a value of 65, the "e" would turn into the char value 166.
 */

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
