import java.util.*;

public class Main {
  public static void main(String[] args) {
    String input = "Hello World";
    ToneMapper T = new ToneMapper();
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

    for (int i = 0; i < alpha.length()-1; i++) {
      charMap.put(alpha.charAt(i), i+1);
      charMap.put(alpha.charAt(i+1), i+1);
      i++;
    }

    for (int i = 1; i < numTones; i++) {
      toneMap.put(i,tones[i]);
    }
  }

  public String map(String s) {
    String output = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        int index = charMap.get(s.charAt(i)) % numTones;
        System.out.println(index);
        output += toneMap.get(index);
        output += " ";
      }
    }
    return output;
  }

}
