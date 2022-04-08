import java.util.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    ToneMapper T = new ToneMapper();
    final Scanner sc = new Scanner(System.in);
    
    System.out.print("Input: ");
    String input = sc.nextLine();
    
    System.out.println(T.map(input));
  }
}

class ToneMapper {
  private final String alpha = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
  private String[] tones = {"C","C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B"};
  
  private HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
  private HashMap<Integer, String> toneMap = new HashMap<Integer, String>();
  
  private final int numTones = 12;

  public ToneMapper() {
    initCharMap();
    initToneMap();
    
  }

  private void initCharMap() {
      int idx = 0;
      for (int i = 0; i < alpha.length(); i++) {
      
      charMap.put(alpha.charAt(i), idx);
      charMap.put(alpha.charAt(i+1), idx);
     
      i++;
      idx++;
      
    }
  }
  
  private void initToneMap() {
    for (int i = 0; i < numTones; i++) {
      toneMap.put(i,tones[i]);
    }  
  }
  
  private boolean isPunct(Character ch) {
      
      String punct = ".!?,;:'[]{}()@#$%^&*<>~`|+_-* ";
      for (int i = 0; i < punct.length(); i++) {
        if (ch == punct.charAt(i)) {
            return true;
        }    
      }
      return false;
      
  }
  
  public String map(String s) {
    String output = "";
    
    for (int i = 0; i < s.length(); i++) {
      if (!isPunct(s.charAt(i))) {
        int index = charMap.get(s.charAt(i)) % (numTones);
        
        output += toneMap.get(index);
        output += " ";
      }
    }
    return output;
  }

}
