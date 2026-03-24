public class palindromeNumber {
     public static void main(String[] args) {
        System.out.println(isPalindrome(393));
    }
    static boolean isPalindrome(int x) {
        int originalNumber = x;
        int reversedNumber = 0;

        while(x > 0){
           int digit = x % 10;
	        reversedNumber = reversedNumber * 10 + digit;
	        x /= 10;
        }
        return originalNumber == reversedNumber;

    }
}
