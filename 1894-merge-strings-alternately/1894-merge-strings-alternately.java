class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len = word1.length()+ word2.length();
        char[] str = new char[len];
        int j = 0;
        String strring = "";

        for(int i = 0; (i < word1.length() || i < word2.length()); i++){
            if(word1.length() > i){
                strring += word1.charAt(i);
                // j++;
            }
            if(word2.length() > i){
                strring += word2.charAt(i);
                // j++;
            }
        }

        // String str1 = new String(str);
        return strring;
    }
}