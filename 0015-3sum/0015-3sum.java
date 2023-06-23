class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = nums.length-1;
            int start = i+1;
            int target = -nums[i];
            while(start < j){
                if(nums[start] + nums[j] > target){
                    j--;
                }
                else if(nums[start] + nums[j] < target){
                    start++;
                }
                else if(nums[start] + nums[j] == target){
                    ls.add(Arrays.asList(nums[start], nums[j], nums[i]));

                    while(start < j && nums[start] == nums[start+1]){
                        start++;
                    }

                    while(start < j && nums[j] == nums[j-1]){
                        j--;
                    }
                    
                    start++;
                    j--;
                }
            }
        }
        return ls;
    }
}