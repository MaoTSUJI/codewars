public class Max {
  public static int sequence(int[] arr) {
    if (arr == null) {
      return 0;
    }
    int maxSum = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = arr[i];
      for (int j = i + i; j < arr.length; j++) {
          sum += arr[j];
          if (sum > maxSum) {
            maxSum = sum;
          }
      }
    }
    return maxSum > 0 ? maxSum : 0;
  }
}
