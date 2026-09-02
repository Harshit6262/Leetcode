class Solution {
    public boolean isPalindrome(int x) {
        int dup = x;
        int rev = 0;
        if ( x < 0){
            return false;
        }
        while (x != 0){
            int ld = x % 10;
            rev = (rev * 10) + ld;
            x = x / 10;
        }
        
        return dup == rev;
    }
}