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
            int remainder = 0;
            int temp = x;

            while(temp!=0){
                remainder = temp%10;
                reverse = reverse*10 + remainder;
                temp = temp/10;
            }
        //System.out.println(reverse);
            if(reverse == x){
                return true;
            }

            // if(x < 0 && reverse < 0){
            //     return false;
            // }
        }
        return false;
    }
}