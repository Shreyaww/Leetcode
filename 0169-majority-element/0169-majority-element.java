class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        return nums[nums.length/2];
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
    
        // return key;
    }
}