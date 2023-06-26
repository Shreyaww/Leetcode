class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        // boolean sorted = false;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 1; j < nums.length - i; j++){
        //         if(nums[j-1] > nums[j]){
        //             int temp = nums[j];
        //             nums[j] = nums[j-1];
        //             nums[j-1] = temp;
        //             sorted = true;
        //         }
        //     }
        //     if(sorted == false){
        //         break;
        //     }
        // }
    }
}