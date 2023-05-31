class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;

        for(int num : nums){
            if(num == 1){
                count++;
                maxCount = Math.max(count, maxCount);
            }else{
                count = 0;
            }
        }
        return maxCount;
        // int max = 0, count = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] == 1){
        //         count++;
        //     }
        //     else{
        //         count = 0;
        //     }

        //     max = Math.max(max, count);
        // }
        // return max;
    }
}