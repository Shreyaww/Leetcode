class Solution {
    public boolean isPowerOfTwo(int n) {
        
        return func(n, 1);
        // if(n == 1){
        //     return true;
        // }

        // if(n%2 != 0){
        //         return false;
        // }
        // long result = 1;
        // for(int i = 1; i <= n; i++){
        //     if(n == result){
        //         return true;
        //     }
        //     result = result * 2;
        // }
        // return false;
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