## Description

The program consists of a Cipher interface, 5 classes that implement the Cipher, and SpyEncoder, which contains the main. Each of the 5 Cipher classes implements the Cipher interface differently, with some, like PigLatin, just moving letters around while others, like CharacterShift, change each letters char code.

## Output

```
Welcome to Spy Encoder 1.0
---------------

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 1
Are you (1) encoding or (2) decoding? 1
Input text you would like to process: How are you?
Enter how many letters you want to shift your message by (ex: b is shifted 1 from a): 5
Mtb fwj dtz? 

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 1
Are you (1) encoding or (2) decoding? 2
Input text you would like to process: Mtb fwj dtz?
Enter how many letters you want to shift your message by (ex: b is shifted 1 from a): 5
How are you? 

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 2
Are you (1) encoding or (2) decoding? 1
Input text you would like to process: hello there
Enter what letters you want each of your words to end in: ay
ellohay heretay 

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 2
Are you (1) encoding or (2) decoding? 2
Input text you would like to process: ellohay heretay 
Enter what letters you want each of your words to end in: ay
hello there 

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 3
Are you (1) encoding or (2) decoding? 1
Input text you would like to process: this is a very secret message
You can either enter a full set of 26 unique scrambled letters, or just a word and the program will fill in the rest for you
Enter the encoding key for your message: secretpassword
nwom om s utly mtcltn gtmmsat 

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 3
Are you (1) encoding or (2) decoding? 2
Input text you would like to process: nwom om s utly mtcltn gtmmsat 
You can either enter a full set of 26 unique scrambled letters, or just a word and the program will fill in the rest for you
Enter the encoding key for your message: secretpassword
this is a very secret message 

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 4
Are you (1) encoding or (2) decoding? 1
Input text you would like to process: The message has arrived
Enter a single character as your encryption key: 6
 £©© © ¨¨¬ 
Note: even if your text only shows a couple characters, copy the entire line and it will still decode

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 4
Are you (1) encoding or (2) decoding? 2
Input text you would like to process:  £©© © ¨¨¬ 
Enter a single character as your encryption key: 6
The message has arrived 
Note: even if your text only shows a couple characters, copy the entire line and it will still decode

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 4
Are you (1) encoding or (2) decoding? 1
Input text you would like to process: He is here
Enter a single character as your encryption key: q
¹Ö Úä ÙÖãÖ 
Note: even if your text only shows a couple characters, copy the entire line and it will still decode

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 4
Are you (1) encoding or (2) decoding? 2
Input text you would like to process: ¹Ö Úä ÙÖãÖ 
Enter a single character as your encryption key: q
He is here 
Note: even if your text only shows a couple characters, copy the entire line and it will still decode

0. Exit
1. Caesar's Cipher
2. Pig Latin
3. Monoalphabetic Cipher
4. Character Shift Cipher
Please Select an above option: 0
Thank you for using Spy Encoder
```