import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MorseCodeDecoder {
  public static String decode(String morseCode) {
    // your brilliant code here, remember that you can access the preloaded Morse
    // code table through MorseCode.get(code)
    return Stream.of(morseCode.trim().split("   "))
        .map(e -> Stream.of(e.split(" ")).map(MorseCode::get).collect(Collectors.joining()))
        .collect(Collectors.joining(" "));
  }

  public static String decode1(String morseCode) {
    return Stream.of(morseCode.trim().split("   ")).map(MorseCodeDecoder::decodeWords).collect(Collectors.joining(" "));
  }

  public static String decodeWords(String word) {
    return Stream.of(e.split(" ")).map(MorseCode::get).collect(Collectors.joining());
  }

  public static String decode2(String morseCode) {
    String result = "";
    for (String word : morseCode.trim().split("   ")) {
      for (String letter : word.split("\\s+")) {
        result += MorseCode.get(letter);
      }
      result += ' ';
    }
    return result.trim();
  }
}