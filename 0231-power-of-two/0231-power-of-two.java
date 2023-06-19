class Solution {
    public boolean isPowerOfTwo(int n) {
        return func(n, 1);
    }

    public boolean func(int n, long result){
        if(result == n){
            return true;
        }
        else if(n%2 != 0 || result > n){
            return false;
        }
        result *= 2;
        return func(n, result);
    }
}