class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }

        if(n%2 != 0){
                return false;
        }
        long result = 1;
        for(int i = 1; i <= n; i++){
            if(n == result){
                return true;
            }
            result = result * 2;
        }
        return false;
    }
}