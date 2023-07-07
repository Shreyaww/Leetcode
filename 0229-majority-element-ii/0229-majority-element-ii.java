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


        //Optimal Solution
        int flr = nums.length/3;
        ArrayList<Integer> ls = new ArrayList<>();
        
        int ele1 = 0, ele2 = 0, count1 = 0, count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(count1 == 0 && nums[i] != ele2){
                ele1 = nums[i];
                count1++;
            }
            else if(count2 == 0 && nums[i] != ele1){
                ele2 = nums[i];
                count2++;
            }
            else if(ele1 == nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }

            if(count1 > flr && !(ls.contains(ele1))){
                ls.add(ele1);
            }
            else if(count2 > flr && !(ls.contains(ele2))){
                ls.add(ele2);
            }
        }

        flr = flr + 1;
        count1 = 0;
        count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(ele1 == nums[i]){
                count1++;
            }

            if(ele2 == nums[i]){
                count2++;
            }

            if(count1 >= flr && !(ls.contains(ele1))){
                ls.add(ele1);
            }
            else if(count2 >= flr && !(ls.contains(ele2))){
                ls.add(ele2);
            }
        }
        return ls;

        //Using HashMap(Better) - 
        // int size = nums.length;
        // int flr = size/3 + 1;

        // ArrayList<Integer> ls = new ArrayList<>();
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < size; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);

        //     if(map.get(nums[i]) == flr){
        //         ls.add(nums[i]);
        //     }
        //     else if(ls.size() == 2){
        //         return ls;
        //     }
        // }

        //return ls;
    }
}