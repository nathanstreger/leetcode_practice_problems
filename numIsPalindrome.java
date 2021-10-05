public class numIsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int init = x;
        int rev = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x = x /10;
            
            rev = rev * 10 + digit;
        }
        
        return init == rev;
    }
}
