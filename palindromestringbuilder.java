class Solution {
    boolean isPalindrome(String s) {
        // code here
          String reversed = new StringBuilder(s).reverse().toString();
          return s.equals(reversed);
    }
};
