class Solution {
    public int missingNumber(int[] nums) {
        return search(nums);
    }

    public int search(int[] nums){
        int start = 0;
        int end = nums.length;
        Arrays.sort(nums);
        
        while(start <= end){
            for(int i = 0; i < nums.length; i++){
                if(nums[start] != i){
                    return i;
                }
                else if(nums[end-1] == nums.length-i){
                    start++;
                    end--;
                }
                else{
                    return (nums.length-i);
                }   
            }
        }
        return 0;
    }
}