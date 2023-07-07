class Solution {
    public int majorityElement(int[] nums) {
        //Soln3 - 
        int size = nums.length/2;

        for(int i = 0; i < nums.length; i++){
            int count = 1;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j] && i!= j){
                    count++;
                }

                if(count > size){
                    return nums[i];
                }
            }
        }
        
        return 0;

        //Soln2- 
        // Arrays.sort(nums);
        // return nums[nums.length/2];



        //Soln 1 - 
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int val: nums){
        //     map.put(val, map.getOrDefault(val, 0)+1);
        // }
        
        // int max = 0;
        // int key = -1;
        // for(Map.Entry<Integer, Integer> maps : map.entrySet()){
        //     int val = maps.getValue(); 
        //     int key1 = maps.getKey(); 

        //     if(val > max){
        //         key = key1; 
        //         max = val;  
        //     }
        // }
    
        //return key;
    }
}