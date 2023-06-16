package main.java.hu.varga._13_isPalindrome;

public class Palindrome {
    private static boolean isPalindrome(String str) {
        int j = str.length() - 1;
        boolean result = false;
        for (int i = 0; i < (str.length() / 2) + 1; i++) {
            if (str.charAt(i) == str.charAt(j)) {
                result = true;
            } else {
                return false;
            }
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("asdfgh"));
        System.out.println(isPalindrome("madam"));
    }
}
