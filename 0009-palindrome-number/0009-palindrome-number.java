class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int remainder = 0;
        boolean bool = false;
        int temp = x;

        while(temp!=0){
            remainder = temp%10;
            reverse = reverse*10 + remainder;
            temp = temp/10;
        }
        //System.out.println(reverse);
        if(reverse == x){
            bool = true;
        }

        if(x < 0 && reverse < 0){
            bool = false;
        }

        return bool;
    }
}