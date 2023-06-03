class Solution {
    public int arraySign(int[] nums) {
        int product = 1;

        for(int val : nums){
            if(val == 0){
                return 0;
            }
            else if(val > 0){
                product *= 1;
            }
            else if(val < 0){
                product *= -1;
            }
        }
        return product;
    }
}