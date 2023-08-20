class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        String s1 = "";
    
        for(int i = 0; i < k; i++){
            s1 += str[i] + " ";
        }

        return s1.trim();
    }
}