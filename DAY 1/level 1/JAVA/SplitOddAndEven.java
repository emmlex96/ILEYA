import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitOddAndEven {


public static int[][] splitOddAndEven(int[] nums) {
    List Integer odds  = new ArrayList();
    List Integer evens = new ArrayList();

    for (int num : nums) {
        if (num % 2 != 0) {
            odds.add(num);
        } else {
            evens.add(num);
        }
    }

    int[] oddArray  = odds.stream().mapToInt(Integer::intValue).toArray();
    int[] evenArray = evens.stream().mapToInt(Integer::intValue).toArray();

    return new int[][] { oddArray, evenArray };
}

public static void main(String[] args) {
    int[] input    = { 45, 60, 3, 10, 9, 22 };
    int[][] result = splitOddAndEven(input);

    System.out.println("Input : " + Arrays.toString(input));
    System.out.println("Odds  : " + Arrays.toString(result[0]));
    System.out.println("Evens : " + Arrays.toString(result[1]));
}
```

}
