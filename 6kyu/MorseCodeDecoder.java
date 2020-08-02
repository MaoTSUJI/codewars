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
}