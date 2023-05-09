public class PigLatin implements Cipher {
  private final String suffix;
  public PigLatin(String suffix) {
    this.suffix = suffix;
  }

  private boolean isVowel(char c) {
    return "AEIOUaeiou".contains(String.valueOf(c));
  }
  @Override
  public String encode(String plainText) {
    String[] words = plainText.toLowerCase().split(" ");
    StringBuilder cipherText = new StringBuilder();
    for (String w : words) {
      for (int i = 0; i < w.length(); i++) {
        char c = w.charAt(i);
        if (!Character.isAlphabetic(c)) {w = w.replace(Character.toString(c), "");}
      }
      int divider = isVowel(w.charAt(0)) ? 0 : 1;
      String end = w.substring(0, divider) + suffix;
      String rem = w.substring(divider);
      cipherText.append(rem).append(end).append(" ");
    }
    return cipherText.toString();
  }

  @Override
  public String decode(String cipherText) {
    String[] words = cipherText.split(" ");
    StringBuilder plainText = new StringBuilder();
    for (String w : words) {
      w = w.replace(suffix, "");
      if (!isVowel(w.charAt(w.length() - 1))) {
        w = w.charAt(w.length() - 1) + w.substring(0, w.length() - 1);
      }
      plainText.append(w).append(" ");
    }
    return plainText.toString();
  }
}
