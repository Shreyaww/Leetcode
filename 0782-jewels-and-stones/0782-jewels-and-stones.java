class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(jewels.charAt(j) == stones.charAt(i)){
                    num++;
                }
            }
        }
        return num;
    //If I solve the sum using hashmap the beats reduce to 5% of Java Solutions, Hence Brute F
        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < stones.length(); i++){
        //     map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
        // }
        // System.out.println(map);

        // int count = 0;
        // for(int i = 0; i < jewels.length(); i++){
        //     count += map.getOrDefault(jewels.charAt(i), 0);
        // }
        // return count;
    }
}