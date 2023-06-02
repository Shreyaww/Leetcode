class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            
        }
        System.out.println(map);
        for(int i = 0; i < nums.length; i++){
            if(map.getOrDefault(nums[i], 0) > 1){
                return true;
            }
        }

        
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length-1; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }
        return false;
    }
}