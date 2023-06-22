class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        // int i = 0, j = nums.length-1;
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        // while(i < j){
        //     if(nums[i] + nums[j] > target){
        //         j--;
        //     }
        //     else if(nums[i] + nums[j] < target){
        //         i++;
        //     }
        //     else{
        //         return new int[]{i,j};
        //     }
        // }
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    temp[0] = i;
                    temp[1] = j;
                   
                }
            }
        }
        return temp;
    }
}