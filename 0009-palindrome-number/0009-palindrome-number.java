class Solution {
    public boolean isPalindrome(int x) {
        // Check Negative number
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reverse = 0;
        
        while (x > reverse){
            int ld = x % 10;
            reverse = (reverse * 10) + ld;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }
}