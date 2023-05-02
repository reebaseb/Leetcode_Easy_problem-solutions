//java

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert to String
        int n = s.length(); 

        for (int i=0; i<n/2; i++) {
            //check whether elements at the same distance from beginning and from ending are same, if not, return false
            if (s.charAt(i) != s.charAt(n-i-1))
              return false;
        }

        // if no flaws found then return true
        return true;
    }
}
