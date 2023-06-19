class Solution {
    public boolean isPowerOfFour(int n) {
        return func(n,1);
    }

    public boolean func(int n, long result){
        if(n == result){
            return true;
        }
        else if(n%4 != 0 || result > n){
            return false;
        }

        return func(n, result*4);
    }
}