public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", number[0], number[1], number[2], number[3], number[4], number[5],
        number[6], number[7], number[8], number[9]);
  }

  public static String createPhoneNumber1(int[] numbers) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
  }

  public static String createPhoneNumber2(int[] number) {
    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
  }
}
