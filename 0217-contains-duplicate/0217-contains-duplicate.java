class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            //int num = nums[i];
            if(nums[i] == nums[i+1]){
                return true;
            }
            // for(int j = i+1; j < nums.length; j++){
            //     if(num == nums[j]){
            //         return true;
            //     }
            // }
        }
        return false;
    }
}