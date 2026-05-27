import java.util.Arrays;

public class PalindromeCheckTest {

static int passed = 0;
static int failed = 0;

public static void assertEquals(boolean expected, boolean actual, String testName) {
    if (expected == actual) {
        System.out.println("PASS: " + testName);
        passed++;
    } else {
        System.out.println("FAIL: " + testName);
        System.out.println("  Expected : " + expected);
        System.out.println("  Actual   : " + actual);
        failed++;
    }
}

public static void main(String[] args) {
    System.out.println("=== PalindromeCheck Tests ===\n");


    assertEquals(true,  PalindromeCheck.isPalindromic(new int[]{45, 0, 8, 0, 45}), "Test 1 - Valid palindrome");


    assertEquals(false, PalindromeCheck.isPalindromic(new int[]{1, 2, 3}),         "Test 2 - Not a palindrome");


    assertEquals(true,  PalindromeCheck.isPalindromic(new int[]{7}),               "Test 3 - Single element");


    assertEquals(true,  PalindromeCheck.isPalindromic(new int[]{4, 4}),            "Test 4 - Two same elements");


    assertEquals(false, PalindromeCheck.isPalindromic(new int[]{4, 5}),            "Test 5 - Two different elements");


    assertEquals(true,  PalindromeCheck.isPalindromic(new int[]{1, 2, 2, 1}),      "Test 6 - Even-length palindrome");

    System.out.println("\n Results: " + passed + " passed, " + failed + " failed");
}

}
