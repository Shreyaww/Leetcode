class Solution {
    public int majorityElement(int[] nums) {
        //Optimal Solution(Moore's Solution) -
        int ele = nums[0], count = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == ele){
                count++;
            }
            else if(count == 0){
                ele = nums[i];
            }
            else{
                count--;
            }
        }

        return ele;
        //Soln3 (Brute Force)- 
        // int size = nums.length/2;

        // for(int i = 0; i < nums.length; i++){
        //     int count = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > size){
        //         return nums[i];
        //     }
        // }
        
        // return 0;

        //Soln2- 
        // Arrays.sort(nums);
        // return nums[nums.length/2];



        //Better Solution - 
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int size = nums.length/2;

        // for(int val: nums){
        //     map.put(val, map.getOrDefault(val, 0)+1);
        // }
        
        // for(int i = 0; i < nums.length; i++){
        //     if(map.get(nums[i]) > size){
        //         return nums[i];
        //     }
        // }

        // return 0;
    }
}