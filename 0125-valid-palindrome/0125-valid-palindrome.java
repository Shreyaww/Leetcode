class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(s);

        int start = 0, end = s.length()-1;

        while(start <= end){
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }

        return true;
        // System.out.println(s);
        // StringBuffer str = new StringBuffer(s).reverse();
        // String reverse = str.toString();

        // if(s.equals(reverse))
        //     return true;
        // else
        //     return false;
    }
}