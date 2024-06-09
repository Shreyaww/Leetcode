class Solution {
    public int longestOnes(int[] nums, int k) {
        // Sliding Window - 
        
        int l = 0, r = 0, max = 0, zeros = 0;

        while( r < nums.length){
            if(nums[r] == 0){
                zeros++;
            }
            
            while(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }

                l++;
            }

            if(zeros <= k){
                max = Math.max(r-l+1, max); 
            }

            r++;
        }

        return max;


        // Brute Force - 
        // int count = 0, max = 0;

        // for(int i = 0; i < nums.length; i++){
        //     count = 0;

        //     for(int j = i; j < nums.length; j++){
        //         if(nums[j] == 0 && count <= k){
        //             count++;
        //         }
        //         if(count <= k){
        //             max = Math.max(j-i+1, max);
        //         }
        //     }
        // }

        // return max;
    }
}