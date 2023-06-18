class Solution {
    public boolean isPalindrome(int x) {
    //  //   Method 1 : 
    //     String s = String.valueOf(x);
    //     StringBuilder str = new StringBuilder(s).reverse();

    //     if(str.toString().equals(s)){
    //         return true;
    //     }
    //     return false;

//Method 2 : 
        if(x < 0){
            return false;
        }
        else{
            int reverse = 0;
            int temp = x;

            while(temp!=0){
                reverse = reverse*10 + temp%10;
                temp = temp/10;
            }

            if(reverse == x){
                return true;
            }
        }
        return false;
    }
}