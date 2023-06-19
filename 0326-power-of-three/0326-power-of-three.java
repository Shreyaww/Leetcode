class Solution {
    public boolean isPowerOfThree(int n) {
        return func(n,1);
    }

    public boolean func(int n, long result){
        if(n == result){
            return true;
        }
        else if(n % 3 != 0 || result > n){
            return false;
        }

        return func(n , result*3);
    }
}