public  class PalindromeS1 {
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1)
    public static void main(String[] args) {
        int ex1 = 121;
        int ex2 = -121;
        int ex3 = 10;
        //calling the isPalindrome method and printing the results for the example inputs
        System.out.println(isPalindrome(ex1));
        System.out.println(isPalindrome(ex2));
        System.out.println(isPalindrome(ex3));
    }

    public static boolean isPalindrome(int x) {
        // check if the number is negative or ends with 0 (but is not 0 itself)
        if (x < 0) {
            return false;
        }
        // initialize variables to reverse the number
        int reverse = 0;
        //create a copy of the original number to easy deal with the original value while reversing
        int del= x;
        while (del != 0) {
            int digit = del % 10;
            reverse = reverse * 10 + digit;
            del /= 10;
        }

        return x == reverse;
    }
}