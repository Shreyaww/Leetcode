class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;

        for(; i < nums.length; i+=2){
            int count = 1;
            for(int j = i+1; j < nums.length; j+=2){
                if(nums[i] == nums[j]){
                    count++;
                    break;
                }
            }
            if(count == 1){
                break;
            }
        }
        return nums[i];
        // for(int i = 0; i < nums.length; i++){

        // }
    }
}