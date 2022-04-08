## Description
This is a small program that takes an input string from the user and maps the input to a set of musical notes,
spaces and punctuation excluded. The algorithm used maps each letter of the alphabet (not case sensitive) to a mod-12 index, then maps
the index of each character of the input string to one of the 12 notes, indexed from 0 to 11.

## Usage
To compile/execute the program:
```
javac Main.java
java Main
```

## Example Output
Input:
``` 
The quick, brown fox jumps over the lazy dog!
```

Output:
```
G, G, E, E, G#/Ab, G#/Ab, D, A#/Bb, C#/Db, F, D, A#/Bb, C#/Db, F, D, B, A,
G#/Ab, C, D#/Eb, F#/Gb, D, A, E, F, G, G, E, B, C, C#/Db, C, D#/Eb, D, F#/Gb 

```
