import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class LongestConsec {
  public static String longestConsec(String[] strarr, int k) {
    if (strarr.length == 0 || k > strarr.length || k <= 0)
      return "";

    String longestStr = "";
    for (int index = 0; index < strarr.length - k + 1; index++) {
      StringBuilder sb = new StringBuilder();
      for (int i = index; i < index + k; i++) {
        sb.append(strarr[i]);
      }
      if (sb.toString().length() > longestStr.length()) {
        longestStr = sb.toString();
      }
    }
    return longestStr;
  }

  public static String longestConsec1(String[] strarr, int k) {
    if (k <= 0) {
      return "";
    }

    return IntStream.rangeClosed(0, strarr.length - k)
        .mapToObj(i -> Arrays.stream(strarr, i, i + k).collect(Collectors.joining()))
        .max(Comparator.comparingInt(String::length)).orElse("");
  }

  public static String longestConsec2(String[] strarr, int k) {
    String maxStr = "";
    for (int i = 0; i <= strarr.length - k; i++) {
      String current = IntStream.range(i, i + k).mapToObj(j -> strarr[j]).collect(Collectors.joining());
      if (current.length() > maxStr.length())
        maxStr = current;
    }
    return maxStr;
  }

  public static String longestConsec3(String[] strarr, int k) {

    if (k < 1 || strarr.length < k || strarr.length == 0) {
      return "";
    }

    int startIndex = 0;
    int max = strarr[0].length();
    int sum = 0;

    for (int i = 0; i < strarr.length; i++) {
      sum += strarr[i].length();

      if (i > k - 1) {
        sum -= strarr[i - k].length();
      }

      if (sum > max) {
        max = sum;
        startIndex = i - k + 1;
      }
    }

    String result = "";
    for (int i = startIndex; i < startIndex + k; i++) {
      result += strarr[i];
    }
    return result;
  }

}
