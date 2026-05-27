import java.util.Arrays;

public class PalindromeCheck {


public static boolean isPalindromic(int[] nums) {
    int left  = 0;
    int right = nums.length - 1;

    while (left < right) {
        if (nums[left] != nums[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

public static void main(String[] args) {
    int[] palindrome    = { 45, 0, 8, 0, 45 };
    int[] notPalindrome = { 1, 2, 3 };

    System.out.println("Input : " + Arrays.toString(palindrome));
    System.out.println("Result: " + isPalindromic(palindrome));   

    System.out.println("Input : " + Arrays.toString(notPalindrome));
    System.out.println("Result: " + isPalindromic(notPalindrome)); 
}


}
