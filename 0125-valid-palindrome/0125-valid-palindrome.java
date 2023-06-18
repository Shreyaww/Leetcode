class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        StringBuffer str = new StringBuffer(s).reverse();
        String reverse = str.toString();

        if(s.equals(reverse))
            return true;
        else
            return false;
    }
}