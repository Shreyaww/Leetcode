class Solution {
    public List<Integer> majorityElement(int[] nums) {
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
        }

        return ls;
    }
}