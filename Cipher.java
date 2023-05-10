/*
Name: Landon Davidson
Section: 32768
Program Name: Cipher

Description: Defines an interface for all cipher classes with the functions encode and decode
 */
public interface Cipher {
  public abstract String encode(String plainText);
  public abstract String decode(String cipherText);
}
