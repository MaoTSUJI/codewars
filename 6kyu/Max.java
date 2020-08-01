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

  public static int sequence1(int[] arr) {
    int maxEndingHere = 0;
    int maxSoFar = 0;
    for (int v : arr) {
        max_ending_here = Math.max(0, max_ending_here + v);
        max_so_far = Math.max(max_so_far, max_ending_here);
    }
    return max_so_far;
  }

  public static int sequence2(int[] arr) {
    int m = 0;
    int a = 0;
    int s = 0;
    for (int e : arr) {
        s += e;
        m = Math.min(s, m);
        a = Math.max(a, s - m);
    }
    return a;
  }

  public static int sequence3(int[] arr) {
    int sum = 0;
    int max = 0;
    for (int a: arr) {
        sum += a;
        max = Math.max(max, sum);
        sum = Math.max(sum, 0);
    }
    return max;
  }
}
