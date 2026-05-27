import java.util.Arrays;

public class SplitOddAndEvenTest {


static int passed = 0;
static int failed = 0;

public static void assertArrayEquals(int[] expected, int[] actual, String testName) {
    if (Arrays.equals(expected, actual)) {
        System.out.println("PASS: " + testName);
        passed++;
    } else {
        System.out.println("FAIL: " + testName);
        System.out.println("  Expected : " + Arrays.toString(expected));
        System.out.println("  Actual   : " + Arrays.toString(actual));
        failed++;
    }
}

public static void main(String[] args) {
    System.out.println("=== SplitOddAndEven Tests ===\n");


    int[][] result1 = SplitOddAndEven.splitOddAndEven(new int[]{45, 60, 3, 10, 9, 22});
    assertArrayEquals(new int[]{45, 3, 9},    result1[0], "Test 1 - Odds from mixed array");
    assertArrayEquals(new int[]{60, 10, 22},  result1[1], "Test 1 - Evens from mixed array");


    int[][] result2 = SplitOddAndEven.splitOddAndEven(new int[]{1, 3, 5});
    assertArrayEquals(new int[]{1, 3, 5}, result2[0], "Test 2 - All odds");
    assertArrayEquals(new int[]{},        result2[1], "Test 2 - Evens should be empty");

   
    int[][] result3 = SplitOddAndEven.splitOddAndEven(new int[]{2, 4, 6});
    assertArrayEquals(new int[]{},        result3[0], "Test 3 - Odds should be empty");
    assertArrayEquals(new int[]{2, 4, 6}, result3[1], "Test 3 - All evens");


    int[][] result4 = SplitOddAndEven.splitOddAndEven(new int[]{});
    assertArrayEquals(new int[]{}, result4[0], "Test 4 - Empty input odds");
    assertArrayEquals(new int[]{}, result4[1], "Test 4 - Empty input evens");

    System.out.println("\n Results: " + passed + " passed, " + failed + " failed ");
}


}
