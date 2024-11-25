 # Cipher
 A TUI based cipher encoding/decoding program. Uses the Cipher class as the parent for each Cipher object (CaesarsCipher, CharacterShift, PigLatin, and MonoalphabeticCipher) that implements an encode and decode function in different ways for each cipher:
 - CaesarsCipher: For each character add the shift value to its char value, looping as necessary
 - CharacterShift: Same as CaesarsCipher except the shift value is the char value of the provided character
 - MonoalphabeticCipher: Uses two <Character, Character> hashmaps to implement encode and decode. The hashmaps are populated based on the user provided key by mapping the first occurance of each letter in the key to the next letter in the alphabet and then just finishing the alphabet with the remaining characters
 - PigLatin: Loops over each word and moves the first letter to the end with the user provided suffix
