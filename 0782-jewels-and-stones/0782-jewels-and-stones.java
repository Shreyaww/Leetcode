class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num = 0, k = 0;
        for(int i = 0; i < stones.length(); i++){
            for(int j = 0; j < jewels.length(); j++){
                if(jewels.charAt(j) == stones.charAt(i)){
                    num++;
                }
            }
        }
        return num;
    }
}