class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Brute Force - 
        // ArrayList<Integer> ls = new ArrayList<>();

        // for(int i = 0; i < nums.length; i++){
        //     int count = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > nums.length/3 && !ls.contains(nums[i])){
        //         ls.add(nums[i]);
        //     }
        // }

        // return ls;



        // int flr = nums.length/3;
        // ArrayList<Integer> ls = new ArrayList<>();
        
        // int ele = 0, count = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(count > flr){
        //         ls.add(nums[i]);
        //     }
        //     if(count == 0){
        //         ele = nums[i];
        //         //count++;
        //     }
        //     if(nums[i] == ele){
        //         count++;
        //     }
        //     else if(nums[i] != ele){
        //         count--;
        //     }
        // }
        // return ls;

        //Using HashMap(Better) - 
        int size = nums.length;
        int flr = size/3;

        ArrayList<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < size; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i = 0; i < size; i++){
            if(map.get(nums[i]) > flr && !ls.contains(nums[i])){
                ls.add(nums[i]);
            }
            // else if(ls.size() == 2){
            //     return ls;
            // }
        }

        return ls;
    }
}