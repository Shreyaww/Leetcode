class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int val: nums){
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        
        int max = 0;
        int key = -1;
        for(Map.Entry<Integer, Integer> maps : map.entrySet()){
            int val = maps.getValue(); //1
            int key1 = maps.getKey(); //4

            if(val > max){
                key = key1; //3
                max = val;  //2
            }
            System.out.println(key + " " + max);
        }
        
        System.out.println(map);
        return key;
    }
}