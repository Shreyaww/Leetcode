class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] count = new int[len];
        //Arrays.fill(count, 0);
       
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len; j++){
                if(nums[i] > nums[j]){
                    count[i]++;
                }
            }
        }

        return count;
    }
}