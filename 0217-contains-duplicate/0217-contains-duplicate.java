class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val : nums){
            if(map.containsKey(val)){
                return true;
            }
            map.put(val, 1);
            // map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

            // if(map.getOrDefault(nums[i], 0) > 1){
            //     return true;
            // }    
        }
        return false;
    }
}